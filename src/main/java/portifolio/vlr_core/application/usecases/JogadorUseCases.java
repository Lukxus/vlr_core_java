package portifolio.vlr_core.application.usecases;

import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRequestDTO;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;
import portifolio.vlr_core.domain.utils.pagination.PageVO;

//port
public interface JogadorUseCases {

    public Jogador createJogador(JogadorRequestDTO jogadorRequestDTO);

    public PageVO<Jogador> getAllJogadores(JogadorFilter jogadorFilter, DomainPageRequest pageRequest);

    public Jogador getJogadorById(long id);

    public void removeJogadorById(long id);
}
