package portifolio.vlr_core.adapters.inbound.dtos;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import portifolio.vlr_core.adapters.outbound.postgres.entities.JpaJogadorEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class JogadorFilterSpecification implements Specification<JpaJogadorEntity> {

    private final JogadorFilter filter;

    @Override
    public Predicate toPredicate(Root<JpaJogadorEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        Optional.ofNullable(filter.getTime())
                .ifPresent(time -> predicates.add(criteriaBuilder.equal(root.get("time"), time)));

        Optional.ofNullable(filter.getNome())
                .ifPresent(nome -> predicates.add(criteriaBuilder.like(
                        criteriaBuilder.lower(root.get("nome")), "%" + nome.toLowerCase() + "%"
                )));

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
