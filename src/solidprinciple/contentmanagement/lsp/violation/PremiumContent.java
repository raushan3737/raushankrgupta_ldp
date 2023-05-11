package solidprinciple.contentmanagement.lsp.violation;

import solidprinciple.contentmanagement.srp.improved.ContentDetails;

public class PremiumContent extends Content {
    private ContentDetails contentDetails;

    public PremiumContent(ContentDetails contentDetails) {
        this.contentDetails = contentDetails;
    }

    @Override
    public void preview() {
        System.out.println("Preview the content ");
    }

    @Override
    public void download() {
        System.out.println("Downloading the content...");
    }
}
