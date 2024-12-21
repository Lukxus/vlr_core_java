package portifolio.vlr_core.adapters.outbound.repositories.entities.postgres;

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
@Table(name = "Campeonato")
public class JpaCampeonatoEntity {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
}
