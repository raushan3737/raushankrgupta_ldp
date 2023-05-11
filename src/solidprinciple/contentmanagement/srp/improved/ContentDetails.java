package solidprinciple.contentmanagement.srp.improved;

public class ContentDetails {
    private int id;
    private String contentType;
    private String contentTitle ;

    public ContentDetails(int id , String contentType , String contentTitle) {
        this.id = id;
        this.contentType=  contentType;
        this.contentTitle = contentTitle;
    }

}
