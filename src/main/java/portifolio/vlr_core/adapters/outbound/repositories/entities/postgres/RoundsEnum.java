package portifolio.vlr_core.adapters.outbound.repositories.entities.postgres;

public enum RoundsEnum {
    EQUIPE1DESARMA(1, "Equipe 1 Desarma"),
    EQUIPE1DETONA(2, "Equipe 1 Detona"),
    EQUIPE1ELIMINA(3, "Equipe 1 Elimina"),
    EQUIPE1TEMPO(4, "Equipe 1 Tempo"),
    EQUIPE2DESARMA(5, "Equipe 2 Desarma"),
    EQUIPE2DETONA(6, "Equipe 2 Detona"),
    EQUIPE2ELIMINA(7, "Equipe 2 Elimina"),
    EQUIPE2TEMPO(8, "Equipe 2 Tempo");

    private final int id;
    private final String nome;

    RoundsEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
