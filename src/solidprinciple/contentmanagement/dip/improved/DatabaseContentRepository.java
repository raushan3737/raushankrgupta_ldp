package solidprinciple.contentmanagement.dip.improved;

import solidprinciple.contentmanagement.lsp.improved.Content;

import java.util.List;

public class DatabaseContentRepository implements ContentRepository {
    @Override
    public List<Content> getAllContent() {
        // Code to retrieve all content from the database
        return null;
    }

    @Override
    public void saveContent(Content content) {
        // Code to save content to the database
    }

    @Override
    public void deleteContent(Content content) {
        // Code to delete content from the database
    }
}

/*
In this updated code, the ContentService class now depends on the ContentRepository interface instead of the ContentRepository class directly.
We also introduced a concrete implementation of the ContentRepository interface called DatabaseContentRepository.

This way, if we need to change the database implementation or switch to a different data source altogether, we can create a new implementation
of the ContentRepository interface without affecting the ContentService class. The ContentService class only depends on the abstraction and not
 the details of the database implementation, thus adhering to the DIP.

 */