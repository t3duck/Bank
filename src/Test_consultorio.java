
import java.util.Scanner;

public class Test_consultorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Probando clase paciente");

        var Paciente_1 = new Paciente();
        System.out.println("Ingrese el nombre del paciente: ");
        Paciente_1.setNombre();
        String Nombre = scanner.nextLine();
        System.out.println("Ingresa el sexo del paciente: ");
        Paciente_1.setSexo("");
        String Sexo = scanner.nextLine();
        System.out.println("Ingresa el peso del paciente: ");
        Paciente_1.setPeso();
        int Peso = scanner.nextInt();
        System.out.println("Ingresa la estatura del paciente: ");
        double estatura = scanner.nextDouble();




    }

}
