package portifolio.vlr_core.utils.mappers.time;

import org.springframework.stereotype.Component;
import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaTimeEntity;
import portifolio.vlr_core.domain.time.Time;

@Component
public class TimeMapperImpl implements TimeMapper {

    @Override
    public Time jpaToDomain(JpaTimeEntity jpaTimeEntity) {
        if (jpaTimeEntity == null) {
            throw new IllegalArgumentException("Time não pode ser nulo");
        }

        Time time = new Time();
        time.setId(jpaTimeEntity.getId());
        time.setNome(jpaTimeEntity.getNome());
        return time;
    }
}
