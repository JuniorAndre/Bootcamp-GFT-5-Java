import java.util.Scanner;

public class maiorEMedia{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior;
        int soma = 0
        int i = 0;


        do {
            num = scan.nextInt();
            if (num > maior){
                maior = num;
            }
            soma += num;
            ++i;
        }while(i == 5);

        System.out.println("O maior número é " + maior + " e a média é " + soma/5);

    }
}