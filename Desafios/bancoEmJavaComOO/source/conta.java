public abstract class conta{
  //Variáveis
    private static final String AGENCIA_PADRAO = "613-5";
    private static int SEQUENCIAL = 1011;
    public static int contSacar = 0;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

  //Construtor
    public conta(cliente cliente){ 
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

  //Métodos 
    public void imprimirExtrato(int mes){

    }
    public void sacar(double valor){
        if(valor < this.saldo){
            saldo -= valor;  
        }else{
            System.out.println("Não é possível sacar valor maior do que o saldo disponível");
        }
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, conta contaDestino){
        contaDestino.depositar(valor);
        if(contSacar == 0){
            this.sacar(valor);
        }else{
            contSacar -= 1;
        }
    }
  
  //Get e set
    public String getAgencia (){
        return agencia;
    }
    public int getNumero (){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

  //Imprimir
    protected void imprimirDadosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        
    }

}




