public class contaPoupanca extends conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato de Conta Poupanca ===");
        super.imprimirDadosComuns();
    }
}