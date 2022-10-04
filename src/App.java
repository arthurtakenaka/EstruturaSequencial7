import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int lado, area, dobro;
        System.out.println("Digite o valor do lado do quadrado:");
        lado = entrada.nextInt();
        area = lado * lado;
        dobro = area * 2;

        System.out.println("Area do quadrado e igual a: " + area);
        System.out.println("O dobro da area do quadrado e igual a: "+ dobro);
    }
}
