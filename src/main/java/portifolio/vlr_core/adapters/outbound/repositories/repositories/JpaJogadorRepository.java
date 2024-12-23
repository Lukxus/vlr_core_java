package portifolio.vlr_core.adapters.outbound.repositories.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import portifolio.vlr_core.adapters.outbound.repositories.entities.postgres.JpaJogadorEntity;

public interface JpaJogadorRepository extends JpaRepository<JpaJogadorEntity, Long> {
    
}
