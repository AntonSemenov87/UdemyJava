package AlexLee_youtube.Practices;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_ip_address {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIp = InetAddress.getLocalHost();
        System.out.println("My ip address is: " + myIp.getHostAddress());
    }
}
