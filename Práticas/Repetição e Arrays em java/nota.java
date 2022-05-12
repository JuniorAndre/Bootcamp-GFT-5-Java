import java.util.Scanner;

public class nota{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true) {
            System.out.println("Digite uma nota: ");
            nota = scan.nextInt();
            
            if(nota >= 0 && nota <= 10){
                break;
            }else{
                System.out.println("Valor inválido! Coloque um valor de 0 a 10.");
            }
        }
        System.out.println("Valor válido!");
    }
}
