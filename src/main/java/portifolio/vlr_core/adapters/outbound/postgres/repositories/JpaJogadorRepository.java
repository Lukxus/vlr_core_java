package portifolio.vlr_core.adapters.outbound.postgres.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;

import java.util.UUID;

public interface JpaJogadorRepository extends CrudRepository<JpaJogadorEntity, UUID>, JpaSpecificationExecutor<JpaJogadorEntity> {
    
}
