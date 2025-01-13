package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Partida")
public class JpaPartidaEntity {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private JpaSequenciaPartidaEntity sequenciaPartida;

    private String mapa;

    @OneToOne
    private JpaTimeEntity timeVencedor;
}
