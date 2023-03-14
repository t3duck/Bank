import java.util.Scanner;

public class test_sneaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var Sneaker_1 = new Sneaker();
        System.out.println("Probando clase sneaker");
        System.out.println("Ingresa el color");
        Sneaker_1.setColor();
        String color = scanner.nextLine();
        System.out.println("Ingresa la marca");
        Sneaker_1.setMarca();
        String marca = scanner.nextLine();
        System.out.println("Ingresa el tipo de suela");
        Sneaker_1.setSuela();
        String suela = scanner.nextLine();
        System.out.println("Ingresa la talla");
        Sneaker_1.setTalla();
        double talla = scanner.nextDouble();
    }
}
