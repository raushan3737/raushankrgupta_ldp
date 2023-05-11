package solidprinciple.contentmanagement.lsp.violation;

public class DefaultContent extends Content {

    @Override
    public void preview() {
        System.out.println("Preview the content ");
    }

    @Override
    public void download() {
        // Option not available
        throw new UnsupportedOperationException("Not supported");
    }
}
