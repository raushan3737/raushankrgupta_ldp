package solidprinciple.contentmanagement.dip.improved;
import solidprinciple.contentmanagement.lsp.improved.Content;
import java.util.List;

public class ContentService {
    private final ContentRepository repository;

    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public List<Content> getAllContent() {
        return repository.getAllContent();
    }

    public void saveContent(Content content) {
        repository.saveContent(content);
    }

    public void deleteContent(Content content) {
        repository.deleteContent(content);
    }
}