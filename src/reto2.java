import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        double p,m,vacuna;

        System.out.println("Digite el peso del bebe en gramos");
        p= leer.nextDouble();
        System.out.println("Digite edad del bebe en meses");
        m= leer.nextDouble();
        vacuna= (p+10)/(m*10)*8;
        System.out.println("La dosis que se debe aplicar al bebe es "+vacuna);
        leer.close();
    }
}
