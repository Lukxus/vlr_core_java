package portifolio.vlr_core.domain.roundspartida;

import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaPartidaEntity;
import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.RoundsEnum;
import portifolio.vlr_core.domain.partida.Partida;

import java.util.ArrayList;
public class RoundsPartida {

    
    private long id;

    private Partida partida;

    private ArrayList<RoundsEnum> roundsResult;

}
