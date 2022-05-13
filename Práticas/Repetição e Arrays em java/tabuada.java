import java.util.Scanner;

public class tabuada{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Digite de 1 a 10 para ver a tabuada desse número: ");
        num = scan.nextInt();
        System.out.println("Tabuada de " + num + ":");


        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}