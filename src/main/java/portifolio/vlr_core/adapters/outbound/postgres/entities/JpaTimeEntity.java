package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.*;
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
@Table(name = "Time")
public class JpaTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia especificada
    private long id;

    @Column(name = "nome", nullable = false, length = 255) // Tipo de coluna especificado
    private String nome;

    public JpaTimeEntity(Time time) {
        if (time != null) {
            this.id = time.getId();
            this.nome = time.getNome();
        }
    }
}
