package portifolio.vlr_core.utils.mappers.pagination;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import portifolio.vlr_core.domain.utils.pagination.DomainPageRequest;


@Component
public class PaginationMapperImpl implements PaginationMapper {

    @Override
    public Pageable pageRequestToPageable(DomainPageRequest pageRequest) {
        return PageRequest.of(pageRequest.getPage(), pageRequest.getSize());
    }

    @Override
    public DomainPageRequest pageableToPageRequest(Pageable pageable) {
        return new DomainPageRequest(pageable.getPageNumber(), pageable.getPageSize());
    }
}
