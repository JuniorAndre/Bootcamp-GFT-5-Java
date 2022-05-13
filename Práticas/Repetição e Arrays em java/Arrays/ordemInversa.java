import java.util.Scanner;

public class ordemInversa{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] array = {5, 7, 28, 19, 10, 5};

        System.out.println("Vetor: ");


        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}