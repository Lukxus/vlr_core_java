package portifolio.vlr_core.adapters.outbound.repositories.entities.postgres;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portifolio.vlr_core.domain.time.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Jogador")
public class JpaTimeEntity {
    @Id
    @GeneratedValue
    private long id;

    private String nome;

    public JpaTimeEntity(Time time) {
        this.id = time.getId();
        this.nome = time.getNome();
    }
}

