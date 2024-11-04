import java.net.MalformedURLException;
import java.net.URL;

public class URLMethods {
   public static void main(String[] args) {

      try {

         @SuppressWarnings("deprecation")
         URL url = new URL("http://www.google.com:80/test/index.html?name=example#section");

         // Print the URL parts
         System.out.println("Protocol: " + url.getProtocol());
         System.out.println("Host: " + url.getHost());
         System.out.println("Port: " + (url.getPort() == -1 ? "default" : url.getPort()));
         System.out.println("Path: " + url.getPath());
         System.out.println("Query: " + url.getQuery());
         System.out.println("File: " + url.getFile());
         System.out.println("Ref: " + url.getRef());
      } catch (MalformedURLException e) {
         System.out.println("Invalid URL: " + e.getMessage());
      }

   }
}
