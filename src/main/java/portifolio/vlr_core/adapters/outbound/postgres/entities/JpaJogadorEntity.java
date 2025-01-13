package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portifolio.vlr_core.domain.jogador.Jogador;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Jogador")
public class JpaJogadorEntity {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    
    @ManyToOne
    private JpaTimeEntity time;
    
    public JpaJogadorEntity(Jogador jogador) {
        this.id = jogador.getId();
        this.nome = jogador.getNome();
        this.time = jogador.getTime() != null ? new JpaTimeEntity(jogador.getTime()) : null;
    }
    
}
