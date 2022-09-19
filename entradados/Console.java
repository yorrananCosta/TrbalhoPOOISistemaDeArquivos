package entradados;
import java.util.Scanner;

public class Console {
    private String palavra;
    private Scanner leitor = new Scanner(System.in);

    public String ler() {
        System.out.println("Digite um texto: ");
        palavra = leitor.nextLine();
        return palavra;
    }    
}