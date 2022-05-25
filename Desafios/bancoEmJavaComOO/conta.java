public abstract class conta{
    private static final String AGENCIA_PADRAO = 613-5;
    private static int SEQUENCIAL = 1000;

    protected String agencia;
    protected int numero;
    protected double saldo;

    public conta(){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void imprimirExtrato();

    public void sacar(double valor){
        saldo -= valor;  
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, conta contaDestino){
        /*saldo -= valor;
        contaDestino.saldo += valor;*/
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia (){
        return agencia;
    }
    public int getNumero (){
        return numero;
    }
    public int getSaldo(){
        return saldo
    }

    protected void imprimirDadosComuns(){
        System.out.println(String.format("Agencia: ", super.agencia));
        System.out.println(String.format("Conta: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }

}