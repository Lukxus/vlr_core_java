package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Time")
public class JpaTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia especificada
    private UUID id;

    @Column(name = "nome", nullable = false, length = 255) // Tipo de coluna especificado
    private String nome;
}
