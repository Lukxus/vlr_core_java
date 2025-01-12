package portifolio.vlr_core.domain.sequenciapartida;

import portifolio.vlr_core.adapters.outbound.postgres.entities.TipoPartida;
import portifolio.vlr_core.domain.campeonato.Campeonato;

import java.time.LocalDateTime;

public class SequenciaPartida {

    private long id;

    private String url;

    private Campeonato campeonato;
    private LocalDateTime data;
    private String patch;
    private TipoPartida tipoPartida;

    public SequenciaPartida() {
    }

    public SequenciaPartida(long id, String url, Campeonato campeonato, LocalDateTime data, String patch, TipoPartida tipoPartida) {
        this.id = id;
        this.url = url;
        this.campeonato = campeonato;
        this.data = data;
        this.patch = patch;
        this.tipoPartida = tipoPartida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public TipoPartida getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(TipoPartida tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
}
