package portifolio.vlr_core.utils.mappers.jogador;

import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.domain.jogador.Jogador;

public interface JogadorMapper {

    Jogador jpaToDomain(JpaJogadorEntity jpaJogadorEntity);

    JpaJogadorEntity domainToJpa(Jogador jogador);
}
