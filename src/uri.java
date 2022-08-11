
import java.net.*;
import java.util.Collections;
import java.util.Enumeration;

public class uri {
    public static void main(String[] args) throws UnknownHostException, URISyntaxException {
        //uri
        String website = "https://en.wikipedia.org/wiki/URI_normalization";
        URI webURI =  new URI("https","en.wikipedia.org","/wiki/URI_normalization","Normalization_Process");
        getURI(webURI);
    }

    //method
    static void getURI(URI myUri){
        System.out.println(myUri.getAuthority());
        System.out.println(myUri.getPath());
        System.out.println(myUri.getHost());
        System.out.println(myUri.getPort());
        System.out.println(myUri.getScheme());
        System.out.println(myUri.getQuery());
    }
}
