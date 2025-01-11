package portifolio.vlr_core.domain.utils.pagination;


public class DomainPageRequest {

    private final int page;
    private final int size;

    public DomainPageRequest(int page, int size) {
        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }
        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }
}
