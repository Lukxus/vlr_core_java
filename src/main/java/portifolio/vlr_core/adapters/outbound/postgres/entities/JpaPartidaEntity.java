package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    private JpaSequenciaPartidaEntity sequenciaPartida;

    private String mapa;

    private JpaTimeEntity timeVencedor;
}
