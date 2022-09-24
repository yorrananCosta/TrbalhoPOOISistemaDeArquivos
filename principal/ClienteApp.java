import arquivo.GerenciadorClientesArquivo;
import entradados.*;

public class ClienteApp {
  public static void main(String[] args) {
    int count = 0; 

    GerenciadorClientesArquivo gere = new GerenciadorClientesArquivo();
    
    while (count < 10) {
      gere.gravarClientes(Console.ler()); 
      count++;
    }
    gere.lerClientes();
  }
}
