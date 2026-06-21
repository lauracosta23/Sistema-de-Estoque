import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Produto:");
        String produto = sc.nextLine();

        System.out.println("Quantidade:");
        int quantidade = sc.nextInt();

        System.out.println("\nEstoque");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);

        sc.close();
    }
}
