import java.util*;

public class Main{

    public static void main(String[] args){
        conta cCorrente = new contaCorrente;
        conta cPoupanca = new contaPoupanca;

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();

    }
}
