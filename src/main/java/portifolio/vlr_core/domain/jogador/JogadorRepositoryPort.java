package portifolio.vlr_core.domain.jogador;

import org.springframework.data.domain.Page;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;
import portifolio.vlr_core.domain.utils.pagination.PageVO;

import java.util.List;
import java.util.Optional;

//port
public interface JogadorRepositoryPort {

    Jogador save(Jogador jogador);

    Optional<Jogador> findById(long id);

    List<Jogador> findAll();

    PageVO<Jogador> findAll(JogadorFilter jogadorFilter, DomainPageRequest pageRequest);
    
    void deleteById(long id);

}
