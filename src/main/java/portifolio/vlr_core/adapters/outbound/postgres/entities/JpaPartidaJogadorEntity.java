package portifolio.vlr_core.adapters.outbound.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "PartidaJogador")
public class JpaPartidaJogadorEntity {

    @Id
    @GeneratedValue
    private long id;
    
    @OneToOne
    private JpaPartidaEntity partida;
    
    @OneToOne
    private JpaJogadorEntity jogador;
    
    private String agenteJogador;
    private Double rDefesa;
    private Double rAtaque;
    private Double rGeral;
    private Integer acsDefesa;
    private Integer acsAtaque;
    private Integer acsGeral;
    private Integer kDefesa;
    private Integer kAtaque;
    private Integer kGeral;
    private Integer dDefesa;
    private Integer dAtaque;
    private Integer dGeral;
    private Integer aDefesa;
    private Integer aAtaque;
    private Integer aGeral;
    private Integer kdaDefesa;
    private Integer kdaAtaque;
    private Integer kdaGeral;
    private Integer kastDefesa;
    private Integer kastAtaque;
    private Integer kastGeral;
    private Integer adrDefesa;
    private Integer adrAtaque;
    private Integer adrGeral;
    private Integer hsDefesa;
    private Integer hsAtaque;
    private Integer hsGeral;
    private Integer fkDefesa;
    private Integer fkAtaque;
    private Integer fkGeral;
    private Integer fdDefesa;
    private Integer fdAtaque;
    private Integer fdGeral;
    private Integer fkfdDefesa;
    private Integer fkfdAtaque;
    private Integer fkfdGeral;

}
