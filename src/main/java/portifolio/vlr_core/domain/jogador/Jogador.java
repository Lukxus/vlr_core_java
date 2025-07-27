package portifolio.vlr_core.domain.jogador;

import portifolio.vlr_core.domain.time.Time;

import java.util.UUID;

public class Jogador {

    private UUID id;
    private String nome;
    private UUID time;

    public Jogador() {}

    public Jogador(String nome, UUID time) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.time = time;
    }

    public Jogador(UUID id, String nome, UUID time) {
        this.id = id;
        this.nome = nome;
        this.time = time;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getTime() {
        return time;
    }

    public void setTime(UUID time) {
        this.time = time;
    }
}
