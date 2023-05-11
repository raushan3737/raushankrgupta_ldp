package solidprinciple.contentmanagement.srp.improved;
public class PostContent {
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
