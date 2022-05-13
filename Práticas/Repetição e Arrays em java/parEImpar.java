import java.util.Scanner;

public class parEImpar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.println("Digite a quatidade total de números: ");
        n = scan.nextInt();
        int par = 0;
        int impar = 0;
        int num;
        int count = 0;

        do{
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            count++;
        }while(count < n);

        System.out.println("São " + par + " pares e " + impar + "ímpares");
    }
}

