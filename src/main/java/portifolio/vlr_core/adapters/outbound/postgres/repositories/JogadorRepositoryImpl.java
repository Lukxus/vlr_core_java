package portifolio.vlr_core.adapters.outbound.postgres.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilterSpecification;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepositoryPort;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;
import portifolio.vlr_core.domain.utils.pagination.PageVO;
import portifolio.vlr_core.utils.mappers.jogador.JogadorMapper;
import portifolio.vlr_core.utils.mappers.pagination.PaginationMapper;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Repository
public class JogadorRepositoryImpl implements JogadorRepositoryPort {

    private final JpaJogadorRepository jpaJogadorRepository;
    private final JogadorMapper jogadorMapper;
    private final TimeMapper timeMapper;
    private final PaginationMapper paginationMapper;

    @Autowired
    public JogadorRepositoryImpl(JpaJogadorRepository jpaJogadorRepository,
                                 JogadorMapper jogadorMapper,
                                 TimeMapper timeMapper,
                                 PaginationMapper paginationMapper) {
        this.jpaJogadorRepository = jpaJogadorRepository;
        this.jogadorMapper = jogadorMapper;
        this.timeMapper = timeMapper;
        this.paginationMapper = paginationMapper;
    }

    @Override
    public Jogador save(Jogador jogador) {
        JpaJogadorEntity jpaJogadorEntity = jogadorMapper.domainToJpa(jogador);
        JpaJogadorEntity savedEntity = jpaJogadorRepository.save(jpaJogadorEntity);
        return jogadorMapper.jpaToDomain(savedEntity);
    }

    @Override
    public Optional<Jogador> findById(long id) {
        return jpaJogadorRepository.findById(id)
                .map(jogadorMapper::jpaToDomain);
    }

    @Override
    public List<Jogador> findAll() {
        return StreamSupport.stream(jpaJogadorRepository.findAll().spliterator(), false)
                .map(jogadorMapper::jpaToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public PageVO<Jogador> findAll(JogadorFilter jogadorFilter, DomainPageRequest pageRequest) {
        Pageable pageable = paginationMapper.pageRequestToPageable(pageRequest);
        JogadorFilterSpecification specification = new JogadorFilterSpecification(jogadorFilter);

        jpaJogadorRepository.findAll(specification, pageable);

        Page<JpaJogadorEntity> springPage = jpaJogadorRepository.findAll(specification, pageable);

        List<Jogador> jogadores = springPage.getContent()
                .stream()
                .map(jogadorMapper::jpaToDomain)
                .collect(Collectors.toList());

        return new PageVO<>(
                jogadores,
                springPage.getNumber(),
                springPage.getSize(),
                springPage.getTotalElements()
        );
    }

    @Override
    public void deleteById(long id) {
        jpaJogadorRepository.deleteById(id);
    }
}
