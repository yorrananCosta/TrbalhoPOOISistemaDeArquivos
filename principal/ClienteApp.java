import arquivo.GerenciadorClientesArquivo;
import entradados.*;
import cliente.*;

public class ClienteApp {
  public static void main(String[] args) {
    GerenciadorClientesArquivo gerenciador = new GerenciadorClientesArquivo();
    Cliente cliente = new Cliente();
    System.out.println("--- SISTEMA DE ARQUIVOS GERAIS ---");
    System.out.println("Digite seu nome: ");
    cliente.setNomeCliente(Console.ler());
    System.out.println("----------------------------------");
    System.out.println("Olá " + cliente.getNomeCliente() + " :) ");
    System.out.println("Por favor digite os dez nomes requisitados para esse processo.");
    System.out.println("Após isso será apresentado os nomes inseridos até aqui");
    System.out.println("e o processo será encerrado.");
    int count = 0; 
    while (count < 10) {
      gerenciador.gravarClientes(Console.ler()); 
      count++;
    }
    System.out.println("Nomes ja inseridos:");
    gerenciador.lerClientes();
  }
}
