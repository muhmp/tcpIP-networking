import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class inet {
    public static void main(String[] args) throws IOException  {
        /*InetAddress names[] = InetAddress.getAllByName("google.com");
        for(InetAddress name: names) {
            System.out.println(name);
        }

         */
        InetAddress myAddress = InetAddress.getLoopbackAddress(); // 127.0.0.1
        System.out.println(myAddress.getAddress().length);
        if(myAddress.isLoopbackAddress()){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
