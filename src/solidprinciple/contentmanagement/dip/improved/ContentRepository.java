package solidprinciple.contentmanagement.dip.improved;
import solidprinciple.contentmanagement.lsp.improved.Content;
import java.util.List;

public interface ContentRepository {
    List<Content> getAllContent();

    void saveContent(Content content);

    void deleteContent(Content content);
}