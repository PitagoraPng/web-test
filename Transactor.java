import java.util.Scanner;

public class Transactor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Su cantidad de diero diponible en la cuenta es: $250.000 COP ");
        double saldo = 250000;

        System.out.print("Escriba su nombre: ");
        String remitente = scanner.nextLine();

        System.out.print("Escriba el nombre del destinario: ");
        String destinario = scanner.nextLine();

        System.out.print("Ingrese la cantidad de dinero a enviar: ");
        double cantidad = scanner.nextDouble();

        if (cantidad > saldo) {
            System.out.println("Error: no tienes suficiente saldo para realizar esta transaccion");
        }else {
            saldo -= cantidad;
            System.out.println("Transaccion realizada con exito");
            System.out.println(remitente + " ha enviado $" + cantidad + "COP a " + destinario + ".");
            System.out.println("Tu saldo restante es: $" + saldo + " COP");
        }
        scanner.close();
    }
    }
