package portifolio.vlr_core.domain.campeonato;

public class Campeonato {

    private long id;
    private String nome;

    public Campeonato() {
    }

    public Campeonato(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
