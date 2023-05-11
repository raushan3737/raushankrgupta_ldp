package solidprinciple.contentmanagement.dip.violation;

/*
In this code, the ContentService class depends directly on the ContentRepository class, violating the DIP.
To apply the DIP, we can introduce an interface for the repository and make the service depend on that interface instead:
 */

import solidprinciple.contentmanagement.lsp.improved.Content;

import java.util.List;

public class ContentService {
    private final ContentRepository repository;

    public ContentService() {
        this.repository = new ContentRepository();
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