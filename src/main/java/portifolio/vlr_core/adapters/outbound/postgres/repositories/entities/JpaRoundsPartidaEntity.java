package portifolio.vlr_core.adapters.outbound.postgres.repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RoundsPartida")
public class JpaRoundsPartidaEntity {

    @Id
    @GeneratedValue
    private long id;

    private JpaPartidaEntity partida;

    private ArrayList<RoundsEnum> roundsResult;
    
}
