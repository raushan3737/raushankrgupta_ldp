package solidprinciple.contentmanagement.srp.violation;

import java.util.ArrayList;

public class Content {
    private int id;
    private String contentType;
    private String contentTitle ;

    public Content(int id , String contentType , String contentTitle) {
        this.id = id;
        this.contentType=  contentType;
        this.contentTitle = contentTitle;
    }

    public void doNotifiedUser(ArrayList<User> users  ){
        System.out.println("Notified...");
    }
    public boolean doPostContent(String platform , Object content , String server) {
        System.out.println("Posting the content on " + platform + "about: " + content);
        if(server.equals("aws")){
            // Logic to store the post in Amazon Web Services
        }else if(server.equals("gcp"))
        {
            // Logic to store the post in Google Cloud Platform
        }else{
            // Logic to store the post in salesforce
        }
        return  true;
    }
}

class User{
    private int userId;
    private String userType;
    private String userEmail;
    private String userContactNo;
    private String notificationMedium ;
    public User(int userId , String userType , String userEmail , String userContactNo , String notificationMedium){
        this.userId = userId;
        this.userType = userType ;
        this.userEmail = userEmail;
        this.userContactNo = userContactNo ;
        this.notificationMedium = notificationMedium ;
    }
}
