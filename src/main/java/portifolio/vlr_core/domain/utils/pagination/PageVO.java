package portifolio.vlr_core.domain.utils.pagination;

import portifolio.vlr_core.domain.utils.pagination.PageMetadataVO;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class PageVO<T> {

    private List<T> content;
    private PageMetadataVO metadata;

    public PageVO(List<T> content, int pageNumber, int pageSize, long totalElements) {
        this.content = content;
        this.metadata = new PageMetadataVO();
        metadata.setNumber(pageNumber);
        metadata.setSize(pageSize);
        metadata.setTotalElements(totalElements);
        metadata.setTotalPages(pageSize == 0 ? 1 : (int) Math.ceil((double) totalElements / pageSize));
    }

    public <U> PageVO<U> map(Function<T, U> mapper) {
        List<U> mappedContent = this.content.stream()
                .map(mapper)
                .collect(Collectors.toList());
        return new PageVO<>(mappedContent, metadata.getNumber(), metadata.getSize(), metadata.getTotalElements());
    }

    // Getters e Setters
}
