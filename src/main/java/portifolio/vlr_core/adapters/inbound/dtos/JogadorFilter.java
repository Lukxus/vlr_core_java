package portifolio.vlr_core.adapters.inbound.dtos;

import lombok.Data;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import portifolio.vlr_core.adapters.outbound.postgres.repositories.entities.JpaJogadorEntity;
import portifolio.vlr_core.domain.time.Time;


@Data
public class JogadorFilter {

    @Nullable
    private String nome;

    @Nullable
    private Time time;

    public Specification<JpaJogadorEntity> toSpecification() {
        return (root, query, criteriaBuilder) -> {
            var predicates = criteriaBuilder.conjunction();

            if (nome != null && !nome.isEmpty()) {
                predicates.getExpressions().add(
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("nome")), "%" + nome.toLowerCase() + "%")
                );
            }

            if (time != null) {
                predicates.getExpressions().add(
                        criteriaBuilder.equal(root.get("time"), time)
                );
            }

            return predicates;
        };
    }
}
