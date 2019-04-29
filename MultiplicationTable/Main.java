import java.io.IOException;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();        
      
    for( int i = 1; i < 10; i++ ) {
      System.out.println( x + " * " + i + " = " + x * i );
    }
  }
}