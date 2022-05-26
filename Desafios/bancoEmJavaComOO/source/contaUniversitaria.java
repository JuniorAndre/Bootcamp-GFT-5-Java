public class contaUniversitaria extends conta{
  
    public static final double LIMITE_SALDO = 2000d;
  
    public contaUniversitaria(cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato (int mes){
        System.out.println("=== Extrato de Conta Universitária ===");
        super.imprimirDadosComuns();
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    @Override
    public void depositar(double valor){
        if(valor + this.saldo <= LIMITE_SALDO){
            saldo += valor;
        }else{
            System.out.println("Conta Universitária apenas aceita um limite de 2000 reais em saldo");
            contSacar += 1;
        }
    }
  
}