public class contaCorrente extends conta{
  
    public static final double TAXA_MANUTENCAO = 20d;
  
    public contaCorrente(cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(int mes){
        System.out.println("=== Extrato de Conta Corrente ===");
        super.imprimirDadosComuns();
        System.out.println(String.format("Saldo: %.2f", this.saldo - TAXA_MANUTENCAO * mes));
    }
}