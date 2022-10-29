import java.util.Scanner;
 
public class Reto4
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        System.out.println("Bienvenido al Juego de piedra, papel y tijera");
        try (Scanner teclado = new Scanner(System.in)) {
            int seleccionCompu = (int)(Math.random() * 3) + 1;
      
 
            System.out.print("Indica tu elección [1=Piedra, 2=Papel, 3=Tijera]: ");
            int seleccionUsuario = teclado.nextInt();
 
            System.out.print("El computador escogió: ");
            switch ( seleccionCompu )
            {
                case 1:
                    System.out.println("Piedra");
                    switch ( seleccionUsuario )
                    {
                       case 1: System.out.println("Empate!"); break;
                       case 2: System.out.println("Ganaste!"); break;
                       case 3: System.out.println("Perdiste!"); break;
                    }
                    break;
 
                case 2:
                    System.out.println("Papel");
                    switch ( seleccionUsuario )
                    {
                       case 1: System.out.println("Perdiste!"); break;
                       case 2: System.out.println("Empate!"); break;
                       case 3: System.out.println("Ganaste!"); break;
                    }
                    break;
 
                case 3:
                    System.out.println("Tijera");
                    switch ( seleccionUsuario )
                    {
                       case 1: System.out.println("Ganaste!"); break;
                       case 2: System.out.println("Perdiste!"); break;
                       case 3: System.out.println("Empate!"); break;
                    }
                    break;
            }
        }
    }
}