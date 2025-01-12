package portifolio.vlr_core.utils.mappers.time;

import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaTimeEntity;
import portifolio.vlr_core.domain.time.Time;

public interface TimeMapper {
    Time jpaToDomain(JpaTimeEntity jpaTimeEntity);
    JpaTimeEntity domainToJpa(Time time);
}
