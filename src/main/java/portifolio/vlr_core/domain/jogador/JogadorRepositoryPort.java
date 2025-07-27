package portifolio.vlr_core.domain.jogador;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;

import java.util.Optional;
import java.util.UUID;

public interface JogadorRepositoryPort {

    Jogador save(Jogador jogador);

    Optional<Jogador> findById(UUID id);

    Page<Jogador> findAll(JogadorFilter jogadorFilter, Pageable pageable);

    void deleteById(UUID id);
}
