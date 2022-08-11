
import java.net.MalformedURLException;
import java.net.URL;

public class url {
    public static void main(String[] args) throws MalformedURLException{
        String web = "https://en.wikipedia.org/wiki/URI_normalization";

        URL myUrl = new URL(web);

        getURL(myUrl);
    }

    static void getURL(URL url) {

        System.out.println("HOST = " +url.getHost());
        System.out.println("PATH = "+ url.getPath());
        System.out.println("REF = "+url.getRef());
        System.out.println("PORT = "+url.getPort());
    }

}
