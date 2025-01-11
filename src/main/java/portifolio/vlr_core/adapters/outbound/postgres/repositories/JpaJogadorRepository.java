package portifolio.vlr_core.adapters.outbound.postgres.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import portifolio.vlr_core.adapters.outbound.postgres.repositories.entities.JpaJogadorEntity;

public interface JpaJogadorRepository extends CrudRepository<JpaJogadorEntity, Long>, JpaSpecificationExecutor<JpaJogadorEntity> {
    
}
