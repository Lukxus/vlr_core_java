package portifolio.vlr_core.utils.mappers.jogador;

import org.springframework.stereotype.Component;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorDTO;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorRequestDTO;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;

@Component
public class JogadorMapper {

    private final TimeMapper timeMapper;

    public JogadorMapper(TimeMapper timeMapper) {
        this.timeMapper = timeMapper;
    }

    public Jogador jpaToDomain(JpaJogadorEntity jpaJogadorEntity) {
        if (jpaJogadorEntity == null) {
            throw new IllegalArgumentException("JpaJogadorEntity não pode ser nulo");
        }
        if (jpaJogadorEntity.getTime() == null) {
            throw new IllegalArgumentException("Jogador ou Time não podem ser nulos");
        }
        return new Jogador(
                jpaJogadorEntity.getId(),
                jpaJogadorEntity.getNome(),
                jpaJogadorEntity.getTime().getId()
        );
    }

    public JpaJogadorEntity domainToJpa(Jogador jogador) {
        if (jogador == null) throw new IllegalArgumentException("Jogador não pode ser nulo");

        JpaJogadorEntity jpa = new JpaJogadorEntity();
        jpa.setId(jogador.getId());
        jpa.setNome(jogador.getNome());

        if (jogador.getTime() != null) {
            JpaTimeEntity timeRef = new JpaTimeEntity();
            timeRef.setId(jogador.getTime()); // referenciando pelo UUID
            jpa.setTime(timeRef);
        }

        return jpa;
    }

    public Jogador requestToDomain(JogadorRequestDTO jogadorRequestDTO) {
        if (jogadorRequestDTO == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }

        Jogador jogador = new Jogador();
        jogador.setNome(jogadorRequestDTO.getNome());
        jogador.setTime(jogadorRequestDTO.getIdTime());

        return jogador;
    }

    public JogadorDTO domainToResponse(Jogador jogador) {
        if (jogador == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }

        JogadorDTO jogadorDTO = new JogadorDTO();

        return jogadorDTO;
    }
}
