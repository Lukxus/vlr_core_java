package portifolio.vlr_core.utils.mappers.time;

import org.springframework.stereotype.Component;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.time.Time;

@Component
public class TimeMapper  {

    public Time jpaToDomain(JpaTimeEntity jpaTimeEntity) {
        if (jpaTimeEntity == null) {
            throw new IllegalArgumentException("Time não pode ser nulo");
        }

        return new Time(
                jpaTimeEntity.getNome(),
                jpaTimeEntity.getId()
        );
    }

    public JpaTimeEntity domainToJpa(Time time) {
        if (time == null) {
            throw new IllegalArgumentException("Time não pode ser nulo");
        }

        JpaTimeEntity jpaTimeEntity = new JpaTimeEntity();
        jpaTimeEntity.setId(time.getId());
        jpaTimeEntity.setNome(time.getNome());
        return jpaTimeEntity;
    }
}
