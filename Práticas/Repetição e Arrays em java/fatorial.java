import java.util.Scanner;

public class fatorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Digite um número para saber o fatorial: ");
        num = scan.nextInt();
        int fat = 1;

        for(int i = 1; i <= num; i++){
            fat = fat*i;
        }
        
        System.out.println(" O fatorial desse número é: " + fat);


    }
}