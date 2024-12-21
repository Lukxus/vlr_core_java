package portifolio.vlr_core.domain.jogador;

import portifolio.vlr_core.domain.time.Time;
public class Jogador {

    private long id;
    private String nome;
    private Time time;

    public Jogador() {
    }

    public Jogador(long id, String nome, Time time) {
        this.id = id;
        this.nome = nome;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
