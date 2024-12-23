package portifolio.vlr_core.adapters.outbound.repositories.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaJogadorEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepository;
import portifolio.vlr_core.utils.mappers.jogador.JogadorMapper;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class JogadorRepositoryImpl implements JogadorRepository {

    private final JpaJogadorRepository jpaJogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    @Autowired
    private TimeMapper timeMapper;

    public JogadorRepositoryImpl(JpaJogadorRepository jpaJogadorRepository) {
        this.jpaJogadorRepository = jpaJogadorRepository;
    }

    @Override
    public Jogador save(Jogador jogador) {
        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity(jogador);
        jpaJogadorRepository.save(jpaJogadorEntity);
        return new Jogador(
                jpaJogadorEntity.getId(),
                jpaJogadorEntity.getNome(),
                timeMapper.jpaToDomain(jpaJogadorEntity.getTime())
        );
    }

    @Override
    public Optional<Jogador> findById(long id) {
        Optional<JpaJogadorEntity> jpaJogadorEntity = jpaJogadorRepository.findById(id);
        return jpaJogadorEntity.map(jogadorMapper::jpaToDomain);
    }

    @Override
    public List<Jogador> findAll() {
        return jpaJogadorRepository.findAll()
                .stream()
                .map(entity -> new Jogador(
                                entity.getId(),
                                entity.getNome(),
                                timeMapper.jpaToDomain(entity.getTime())
                        )
                ).collect(Collectors.toList());
    }

    @Override
    public void deleteById(long id) {
        this.jpaJogadorRepository.deleteById(id);
    }
}
