package portifolio.vlr_core.domain.time;

import java.util.UUID;

public class Time {
    private UUID id;
    private String nome;

    public Time(String nome, UUID id) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
