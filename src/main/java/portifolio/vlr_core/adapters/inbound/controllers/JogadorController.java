package portifolio.vlr_core.adapters.inbound.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorDTO;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorRequestDTO;
import portifolio.vlr_core.application.usecases.JogadorUseCases;
import portifolio.vlr_core.domain.jogador.Jogador;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorUseCases jogadorUseCases;

    @Autowired
    public JogadorController(JogadorUseCases jogadorUseCases) {
        this.jogadorUseCases = jogadorUseCases;
    }

    @GetMapping
    public Page<Jogador> getJogadores(
            @Valid JogadorFilter filter,
            @PageableDefault(size = 10) Pageable pageable
    ) {
        return jogadorUseCases.getAllJogadores(filter, pageable);
    }

    @PostMapping
    public JogadorDTO criaJogadores(
            JogadorRequestDTO jogadorRequestDTO
    ) {
        return jogadorUseCases.createJogador(jogadorRequestDTO);
    }
}
