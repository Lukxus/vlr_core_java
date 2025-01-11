package portifolio.vlr_core.utils.mappers.pagination;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;

public interface PaginationMapper {

    Pageable pageRequestToPageable(DomainPageRequest pageRequest);

    DomainPageRequest pageableToPageRequest(Pageable pageable);
}
