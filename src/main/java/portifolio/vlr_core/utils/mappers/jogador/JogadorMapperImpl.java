package portifolio.vlr_core.utils.mappers.jogador;

import org.springframework.stereotype.Component;
import portifolio.vlr_core.adapters.outbound.postgres.repositories.entities.JpaJogadorEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;

@Component
public class JogadorMapperImpl implements JogadorMapper {

    private final TimeMapper timeMapper;

    public JogadorMapperImpl(TimeMapper timeMapper) {
        this.timeMapper = timeMapper;
    }

    @Override
    public Jogador jpaToDomain(JpaJogadorEntity jpaJogadorEntity) {
        if (jpaJogadorEntity == null) {
            throw new IllegalArgumentException("JpaJogadorEntity não pode ser nulo");
        }

        return new Jogador(
                jpaJogadorEntity.getId(),
                jpaJogadorEntity.getNome(),
                jpaJogadorEntity.getTime() != null ? timeMapper.jpaToDomain(jpaJogadorEntity.getTime()) : null
        );
    }

    @Override
    public JpaJogadorEntity domainToJpa(Jogador jogador) {
        if (jogador == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }

        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity();
        jpaJogadorEntity.setId(jogador.getId());
        jpaJogadorEntity.setNome(jogador.getNome());

        if (jogador.getTime() != null) {
            jpaJogadorEntity.setTime(timeMapper.domainToJpa(jogador.getTime()));
        } else {
            jpaJogadorEntity.setTime(null);
        }

        return jpaJogadorEntity;
    }
}
