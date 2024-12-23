package portifolio.vlr_core.application.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portifolio.vlr_core.application.usecases.JogadorUseCases;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepository;
import portifolio.vlr_core.domain.jogador.JogadorRequestDTO;
import portifolio.vlr_core.utils.mappers.jogador.JogadorMapper;

import java.util.List;

;

@Service
@RequiredArgsConstructor
public class JogadorServiceImpl implements JogadorUseCases {

    private final JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;


    @Override
    public Jogador createJogador(JogadorRequestDTO jogadorRequestDTO) {
        return null;
    }

    @Override
    public List<Jogador> getAllJogador(int page, int size) {
        return List.of();
    }

    @Override
    public Jogador getJogadorById(long id) {
        return null;
    }

    @Override
    public void removeJogadorById(long id) {

    }
}
