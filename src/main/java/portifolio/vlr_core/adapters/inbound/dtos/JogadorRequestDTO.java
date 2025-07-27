package portifolio.vlr_core.adapters.inbound.dtos;

import java.util.UUID;

public class JogadorRequestDTO {
    private String nome;
    private UUID idTime;  // Geralmente, recebe o ID do time.

    public JogadorRequestDTO() {}

    public JogadorRequestDTO(String nome, UUID idTime) {
        this.nome = nome;
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getIdTime() {
        return idTime;
    }

    public void setIdTime(UUID idTime) {
        this.idTime = idTime;
    }
}
