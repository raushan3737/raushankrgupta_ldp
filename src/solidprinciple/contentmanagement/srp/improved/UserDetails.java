package solidprinciple.contentmanagement.srp.improved;

public class UserDetails {
    private int userId;
    private String userType;
    private String userEmail;
    private String userContactNo;
    private String notificationMedium ;
    public UserDetails(int userId , String userType , String userEmail , String userContactNo , String notificationMedium){
        this.userId = userId;
        this.userType = userType ;
        this.userEmail = userEmail;
        this.userContactNo = userContactNo ;
        this.notificationMedium = notificationMedium ;
    }
}
