
import java.net.URI;
import java.net.URISyntaxException;

public class URIMethods {
   public static void main(String[] args) throws URISyntaxException {

      URI uri = new URI("http://www.google.com:80/test/index.html?name=example#section");

      // Print the URL parts
      System.out.println("Protocol: " + uri.getScheme());
      System.out.println("Host: " + uri.getHost());
      System.out.println("Port: " + (uri.getPort() == -1 ? "default" : uri.getPort()));
      System.out.println("Path: " + uri.getPath());
      System.out.println("Query: " + uri.getQuery());
      System.out.println("File: " + uri.getFragment());

   }
}
