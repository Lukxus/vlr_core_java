package portifolio.vlr_core.domain.partida;

import portifolio.vlr_core.domain.sequenciapartida.SequenciaPartida;
import portifolio.vlr_core.domain.time.Time;
public class Partida {

    private long id;

    private SequenciaPartida sequenciaPartida;
    private String mapa;
    private Time timeVencedor;

    public Partida() {
    }

    public Partida(long id, SequenciaPartida sequenciaPartida, String mapa, Time timeVencedor) {
        this.id = id;
        this.sequenciaPartida = sequenciaPartida;
        this.mapa = mapa;
        this.timeVencedor = timeVencedor;
    }

    public Time getTimeVencedor() {
        return timeVencedor;
    }

    public void setTimeVencedor(Time timeVencedor) {
        this.timeVencedor = timeVencedor;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public SequenciaPartida getSequenciaPartida() {
        return sequenciaPartida;
    }

    public void setSequenciaPartida(SequenciaPartida sequenciaPartida) {
        this.sequenciaPartida = sequenciaPartida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
