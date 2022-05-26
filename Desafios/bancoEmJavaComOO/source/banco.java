import java.util.*;

public class banco{
    private String nome;
    private List<conta> contas;
    private cliente cliente;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public List<conta> getContas(){
        return contas;
    }
    public void setContas(List<conta> contas){
        this.contas = contas;
    }
    public void listarClientes(List<conta> contas){
        Iterator<conta> iterator = contas.iterator();
        String nomeC = "";
        while(iterator.hasNext()){
            String next = iterator.next().cliente.getNome();
            nomeC = next;
            System.out.println(nomeC);
        }
    }
}
  
  


  
  