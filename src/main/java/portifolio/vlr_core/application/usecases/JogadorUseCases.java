package portifolio.vlr_core.application.usecases;

import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRequestDTO;

import java.util.List;
public interface JogadorUseCases {
    
    public Jogador createJogador(JogadorRequestDTO jogadorRequestDTO);

    public List<Jogador> getAllJogador(int page, int size);

    public Jogador getJogadorById(long id);
    
    public void removeJogadorById(long id);
}
