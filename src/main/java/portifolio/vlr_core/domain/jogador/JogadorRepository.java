package portifolio.vlr_core.domain.jogador;

import java.util.List;
import java.util.Optional;
public interface JogadorRepository {

    Jogador save(Jogador jogador);

    Optional<Jogador> findById(long id);

    List<Jogador> findAll();
    
    void deleteById(long id);

}
