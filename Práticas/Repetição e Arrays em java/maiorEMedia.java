import java.util.Scanner;

public class maiorEMedia{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior = 0;
        int soma = 0
        int count = 0;


        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if (num > maior){
                maior = num;
            }
            soma += num;
            count++;
        }while(count < 5);

        System.out.println("O maior número é " + maior + " e a média é " + soma/5);

    }
}