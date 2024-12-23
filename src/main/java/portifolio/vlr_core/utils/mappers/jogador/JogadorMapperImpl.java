package portifolio.vlr_core.utils.mappers.jogador;

import org.springframework.stereotype.Component;
import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaJogadorEntity;
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
        if (jpaJogadorEntity == null || jpaJogadorEntity.getTime() == null) {
            throw new IllegalArgumentException("Jogador ou Time não podem ser nulos");
        }

        Jogador jogador = new Jogador();
        jogador.setId(jpaJogadorEntity.getId());
        jogador.setNome(jpaJogadorEntity.getNome());
        jogador.setTime(timeMapper.jpaToDomain(jpaJogadorEntity.getTime()));

        return jogador;
    }
}
