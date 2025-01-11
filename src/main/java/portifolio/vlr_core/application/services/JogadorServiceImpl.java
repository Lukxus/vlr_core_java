package portifolio.vlr_core.application.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.application.usecases.JogadorUseCases;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepositoryPort;
import portifolio.vlr_core.domain.jogador.JogadorRequestDTO;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;
import portifolio.vlr_core.domain.utils.pagination.PageVO;

@Service
@RequiredArgsConstructor
public class JogadorServiceImpl implements JogadorUseCases {

    private final JogadorRepositoryPort jogadorRepository;

    @Override
    public Jogador createJogador(JogadorRequestDTO jogadorRequestDTO) {
        return null;
    }

    @Override
    public PageVO<Jogador> getAllJogadores(JogadorFilter jogadorFilter, DomainPageRequest pageRequest) {
        return jogadorRepository.findAll(jogadorFilter, pageRequest);
    }


    @Override
    public Jogador getJogadorById(long id) {
        return null;
    }

    @Override
    public void removeJogadorById(long id) {

    }
}
