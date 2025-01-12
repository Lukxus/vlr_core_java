package portifolio.vlr_core.utils.mappers.time;

import org.junit.jupiter.api.Test;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.time.Time;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapperImplTest {

    private final TimeMapper timeMapper = new TimeMapperImpl();

    @Test
    void testJpaToDomainValid() {
        JpaTimeEntity jpaTimeEntity = new JpaTimeEntity();
        jpaTimeEntity.setId(1L);
        jpaTimeEntity.setNome("Time A");

        Time time = timeMapper.jpaToDomain(jpaTimeEntity);

        assertNotNull(time);
        assertEquals(1L, time.getId());
        assertEquals("Time A", time.getNome());
    }

    @Test
    void testJpaToDomainWithNullThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> timeMapper.jpaToDomain(null));
        assertEquals("Time não pode ser nulo", exception.getMessage());
    }
}
