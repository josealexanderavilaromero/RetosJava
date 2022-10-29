import java.util.Scanner;

public class reto1 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double f,c;

    System.out.println("Digite la temperatura en grados F");
    f= leer.nextDouble();
    c= (f-32)/1.8;
    System.out.println("La temperatura en grados C es "+c);
    leer.close();
  }  
}
