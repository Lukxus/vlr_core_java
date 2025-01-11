package portifolio.vlr_core.adapters.outbound.postgres.repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SequenciaPartida")
public class JpaSequenciaPartidaEntity {

    @Id
    @GeneratedValue
    private long id;

    private String url;

    private JpaCampeonatoEntity campeonato;

    private LocalDateTime data;

    private String patch;

    private TipoPartida tipoPartida;

}
