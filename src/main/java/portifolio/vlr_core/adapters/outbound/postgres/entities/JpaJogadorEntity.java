package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portifolio.vlr_core.domain.jogador.Jogador;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Jogador")
public class JpaJogadorEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private JpaTimeEntity time;

}
