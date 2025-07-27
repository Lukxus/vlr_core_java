package portifolio.vlr_core.adapters.outbound.postgres.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilterSpecification;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepositoryPort;
import portifolio.vlr_core.utils.mappers.jogador.JogadorMapper;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class JogadorRepositoryImpl implements JogadorRepositoryPort {

    private final JpaJogadorRepository jpaJogadorRepository;
    private final JogadorMapper jogadorMapper;

    @Override
    public Jogador save(Jogador jogador) {
        JpaJogadorEntity savedEntity = jpaJogadorRepository.save(jogadorMapper.domainToJpa(jogador));
        return jogadorMapper.jpaToDomain(savedEntity);
    }

    @Override
    public Optional<Jogador> findById(UUID id) {
        return jpaJogadorRepository.findById(id)
                .map(jogadorMapper::jpaToDomain);
    }

    @Override
    public Page<Jogador> findAll(JogadorFilter jogadorFilter, Pageable pageable) {
        JogadorFilterSpecification spec = new JogadorFilterSpecification(jogadorFilter);
        return jpaJogadorRepository.findAll(spec, pageable)
                .map(jogadorMapper::jpaToDomain);
    }

    @Override
    public void deleteById(UUID id) {
        jpaJogadorRepository.deleteById(id);
    }
}
