package portifolio.vlr_core.adapters.outbound.postgres.repositories.entities;

public enum TipoPartida {
    BO1(1, "Best of 1"),
    MAPS2(2, "Maps 2"),
    BO3(3, "Best of 3"),
    BO5(5, "Best of 5");

    private final int id;
    private final String nome;

    TipoPartida(int id, String nome) {
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
