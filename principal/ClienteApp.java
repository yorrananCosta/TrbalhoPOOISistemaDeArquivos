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
    System.out.println("Olá " + cliente.getNomeCliente() + " :) \n");
    System.out.println("Por favor, digite os dez nomes requisitados para este processo.");
    System.out.println("Aperão apresentados os nomes inseridos até aqui,");
    System.out.println("e o processo será encerrado.\n");
    int count = 0; 
    while (count < 10) {
      gerenciador.gravarClientes(Console.ler()); 
      count++;
    }
    System.out.println("\nNomes ja inseridos:");
    gerenciador.lerClientes();
  }
}
