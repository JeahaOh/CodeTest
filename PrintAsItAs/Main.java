import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main (String[] args) throws IOException {
        while( scanner.hasNextLine() ) {
          String str = scanner.nextLine();
          if( str.isEmpty() || str.length() > 100 ) {
            break;
          } else {
              System.out.println(str);
          }

      }
      scanner.close();
   }
}