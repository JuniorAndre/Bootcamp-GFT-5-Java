import java.util.Scanner;

public class nota{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        while(nota > 10 && nota < 0) {
            System.out.println("Digite uma nota: ")
            scan.nextInt(nota);
            System.out.println("Valor inválido! Coloque um valor de 0 a 10.");
        }

        System.out.println("Valor válido!");

    }

}