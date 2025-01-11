package portifolio.vlr_core.domain.utils.pagination;

import lombok.Data;

@Data
public class PageMetadataVO {

    private int number;

    private int size;

    private long totalElements;

    private int totalPages;
}
