package solidprinciple.contentmanagement.lsp.improved;

public class DefaultContent implements Content {
    @Override
    public void preview() {
        System.out.println("Previewing the content");
    }
}
