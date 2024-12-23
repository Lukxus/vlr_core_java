package portifolio.vlr_core.utils.mappers.time;

import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaTimeEntity;
import portifolio.vlr_core.domain.time.Time;

public interface TimeMapper {
    Time jpaToDomain(JpaTimeEntity jpaTimeEntity);
}
