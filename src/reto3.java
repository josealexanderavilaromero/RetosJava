import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int jugador1, cpu;
        
        System.out.println("Bienvenido al juego de Cara y Sello");
        Random aleatorio=new Random();
        cpu=(int)(aleatorio.nextDouble()*2+1);
        System.out.println("Digite 1 para escoger CARA o 2 para seleccionar SELLO ");
        jugador1= leer.nextInt();
        if (jugador1==cpu){
            System.out.println("Ganaste elijieron lo mismo");  
        }
        else if(jugador1!=cpu){
            System.out.println("Perdiste");
        }
leer.close();

    }
}