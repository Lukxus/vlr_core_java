package portifolio.vlr_core.utils.mappers.jogador;

import org.junit.jupiter.api.Test;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;
import portifolio.vlr_core.utils.mappers.time.TimeMapperImpl;

import static org.junit.jupiter.api.Assertions.*;

class JogadorMapperImplTest {

    private final TimeMapper timeMapper = new TimeMapperImpl();
    private final JogadorMapper jogadorMapper = new JogadorMapperImpl(timeMapper);

    @Test
    void testJpaToDomainValid() {
        JpaTimeEntity jpaTimeEntity = new JpaTimeEntity();
        jpaTimeEntity.setId(1L);
        jpaTimeEntity.setNome("Time A");

        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity();
        jpaJogadorEntity.setId(10L);
        jpaJogadorEntity.setNome("Jogador A");
        jpaJogadorEntity.setTime(jpaTimeEntity);

        Jogador jogador = jogadorMapper.jpaToDomain(jpaJogadorEntity);

        assertNotNull(jogador);
        assertEquals(10L, jogador.getId());
        assertEquals("Jogador A", jogador.getNome());
        assertNotNull(jogador.getTime());
        assertEquals(1L, jogador.getTime().getId());
    }

    @Test
    void testJpaToDomainWithNullTimeThrowsException() {
        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity();
        jpaJogadorEntity.setId(10L);
        jpaJogadorEntity.setNome("Jogador A");
        jpaJogadorEntity.setTime(null);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> jogadorMapper.jpaToDomain(jpaJogadorEntity));
        assertEquals("Jogador ou Time não podem ser nulos", exception.getMessage());
    }
}
