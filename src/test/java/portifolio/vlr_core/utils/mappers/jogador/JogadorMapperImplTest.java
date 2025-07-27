package portifolio.vlr_core.utils.mappers.jogador;

import org.junit.jupiter.api.Test;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.jogador.Jogador;
import portifolio.vlr_core.utils.mappers.time.TimeMapper;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class JogadorMapperImplTest {

    private final TimeMapper timeMapper = new TimeMapper();
    private final JogadorMapper jogadorMapper = new JogadorMapper(timeMapper);

    @Test
    void testJpaToDomainValid() {
        UUID uuidTime = UUID.randomUUID();
        JpaTimeEntity jpaTimeEntity = new JpaTimeEntity();
        jpaTimeEntity.setId(uuidTime);
        jpaTimeEntity.setNome("Time A");

        UUID uuidJogador = UUID.randomUUID();
        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity();
        jpaJogadorEntity.setId(uuidJogador);
        jpaJogadorEntity.setNome("Jogador A");
        jpaJogadorEntity.setTime(jpaTimeEntity);

        Jogador jogador = jogadorMapper.jpaToDomain(jpaJogadorEntity);

        assertNotNull(jogador);
        assertEquals(uuidJogador, jogador.getId());
        assertEquals("Jogador A", jogador.getNome());
        assertNotNull(jogador.getTime());
        assertEquals(uuidTime, jogador.getTime());
    }

    @Test
    void testJpaToDomainWithNullTimeThrowsException() {
        UUID uuidJogador = UUID.randomUUID();
        JpaJogadorEntity jpaJogadorEntity = new JpaJogadorEntity();
        jpaJogadorEntity.setId(uuidJogador);
        jpaJogadorEntity.setNome("Jogador A");
        jpaJogadorEntity.setTime(null);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> jogadorMapper.jpaToDomain(jpaJogadorEntity));
        assertEquals("Jogador ou Time não podem ser nulos", exception.getMessage());
    }
}
