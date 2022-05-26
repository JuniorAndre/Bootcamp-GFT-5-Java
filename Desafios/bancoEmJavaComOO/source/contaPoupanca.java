public class contaPoupanca extends conta{
  
    public static final double TAXA_POUPANCA = 0.084;
  
    public contaPoupanca(cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(int mes){
        System.out.println("=== Extrato de Conta Poupanca ===");
        super.imprimirDadosComuns();
        System.out.println(String.format("Saldo: %.2f", this.saldo + this.saldo * Math.pow(TAXA_POUPANCA, mes)));
    }
}