public class contaCorrente extends conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato de Conta Corrente ===");
        super.imprimirDadosComuns();
    }

}