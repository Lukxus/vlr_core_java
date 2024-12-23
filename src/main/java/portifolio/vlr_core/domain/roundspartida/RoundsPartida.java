package portifolio.vlr_core.domain.roundspartida;

import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.RoundsEnum;
import portifolio.vlr_core.domain.partida.Partida;

import java.util.ArrayList;

public class RoundsPartida {


    private long id;

    private Partida partida;
    private ArrayList<RoundsEnum> roundsResult;

    public RoundsPartida() {
    }

    public RoundsPartida(long id, Partida partida, ArrayList<RoundsEnum> roundsResult) {
        this.id = id;
        this.partida = partida;
        this.roundsResult = roundsResult;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ArrayList<RoundsEnum> getRoundsResult() {
        return roundsResult;
    }

    public void setRoundsResult(ArrayList<RoundsEnum> roundsResult) {
        this.roundsResult = roundsResult;
    }

}
