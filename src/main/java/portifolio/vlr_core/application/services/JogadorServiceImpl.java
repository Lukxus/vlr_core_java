package portifolio.vlr_core.application.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorDTO;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorFilter;
import portifolio.vlr_core.application.usecases.JogadorUseCases;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.domain.jogador.JogadorRepositoryPort;
import portifolio.vlr_core.adapters.inbound.dtos.JogadorRequestDTO;
import portifolio.vlr_core.utils.mappers.jogador.JogadorMapper;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JogadorServiceImpl implements JogadorUseCases {

    private final JogadorRepositoryPort jogadorRepository;
    private final JogadorMapper jogadorMapper;

    @Override
    public JogadorDTO createJogador(JogadorRequestDTO jogadorRequestDTO) {
        Jogador jogador = jogadorMapper.requestToDomain(jogadorRequestDTO);
        return jogadorMapper.domainToResponse(jogadorRepository.save(jogador));
    }

    @Override
    public Page<Jogador> getAllJogadores(JogadorFilter jogadorFilter, Pageable pageable) {
        return jogadorRepository.findAll(jogadorFilter, pageable);
    }

    @Override
    public JogadorDTO getJogadorById(UUID id) {
        return jogadorMapper.domainToResponse(jogadorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Jogador não encontrado")));
    }

    @Override
    public void removeJogadorById(UUID id) {
        jogadorRepository.deleteById(id);
    }
}
