package portifolio.vlr_core.domain.time;

public class Time {
    private long id;
    private String nome;

    public Time(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Time() {
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
