import java.util.*;

public class Main{

    public static void main(String[] args){
        banco bancoDoPovo = new banco();
        cliente joao = new cliente();
        joao.setNome("João");
        cliente marcos = new cliente();
        marcos.setNome("Marcos");
        cliente maria = new cliente();
        maria.setNome("Maria");
        cliente carlos = new cliente();
        carlos.setNome("Carlos");
   
        conta cCorrente1 = new contaCorrente(joao);
        conta cPoupanca1 = new contaPoupanca(joao);
        conta cCorrente2 = new contaCorrente(marcos);
        conta cPoupanca2 = new contaPoupanca(marcos);
        conta cPoupanca3 = new contaPoupanca(maria);
        conta cUni1 = new contaUniversitaria(carlos);
      
        List<conta> contaC = new ArrayList<>(Arrays.asList(cCorrente1,  cCorrente2));
        List<conta> contaP = new ArrayList<>(Arrays.asList(cPoupanca1, cPoupanca2, cPoupanca3));
        List<conta> contaUni = new ArrayList<>(Arrays.asList(cUni1));
      
        //Ver o extrato de cada conta
        //cCorrente1.imprimirExtrato();
        //cPoupanca1.imprimirExtrato();
        //cCorrente2.imprimirExtrato();
        //cPoupanca2.imprimirExtrato();
        //cPoupanca3.imprimirExtrato();
      
        //Ver lista de clientes para cada conta
        System.out.println("=== Lista de clientes com conta corrente ===");
        bancoDoPovo.listarClientes(contaC);
        System.out.println("=== Lista de clientes com conta poupança ===");
        bancoDoPovo.listarClientes(contaP);
        System.out.println("=== Lista de clientes com conta universitária ===");
        bancoDoPovo.listarClientes(contaUni);
      
        System.out.println(" ");
        
      //Transações 
        System.out.println("=== Transações feitas ===");
        cCorrente1.depositar(1000);
        cCorrente2.depositar(1500);
        cCorrente2.transferir(200, cCorrente1);
        cCorrente1.transferir(500, cPoupanca1);
        cPoupanca3.depositar(2000);
        cCorrente1.sacar(1000);   //Tentando sacar valor maior que saldo
        cUni1.depositar(1000);
        cUni1.depositar(1000);
        cUni1.depositar(2001);
        cCorrente2.transferir(100, cUni1);
      
        System.out.println(" ");
        
      //Ver quanto ficou na conta após 2 meses as transações
        int mes = 2;
        System.out.println("=== Extrato depois de 2 meses ===");
        cCorrente1.imprimirExtrato(mes);
        cPoupanca1.imprimirExtrato(mes);
        cCorrente2.imprimirExtrato(mes);
        cPoupanca2.imprimirExtrato(mes);
        cPoupanca3.imprimirExtrato(mes);
        cUni1.imprimirExtrato(mes);
    }
}