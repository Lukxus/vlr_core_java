package portifolio.vlr_core.application.usecases;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorDTO;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorRequestDTO;
import portifolio.vlr_core.domain.jogador.Jogador;

import java.util.UUID;

public interface JogadorUseCases {
    JogadorDTO createJogador(JogadorRequestDTO jogadorRequestDTO);

    Page<Jogador> getAllJogadores(JogadorFilter jogadorFilter, Pageable pageable);

    JogadorDTO getJogadorById(UUID id);

    void removeJogadorById(UUID id);
}
