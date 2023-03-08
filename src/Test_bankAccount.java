import java.util.Scanner;

public class Test_bankAccount {

    public static int Menu(){
        Scanner entrada = new Scanner(System.in);
        int option;
        System.out.println("[1] Saldo");
        System.out.println("[2] Retirar");
        System.out.println("[3] Depositar");
        System.out.println("[0] Salir");
        option = entrada.nextInt();
        return option;
    }



  public static void main(String[] args) {
int option = 0;

        System.out.println("Probando bankAccount");

        bankAccount Lupe_nieto = new bankAccount();

        Lupe_nieto.setName("Lupe Nieto");
        Lupe_nieto.setBalance(2000.00);
        Lupe_nieto.setCardnumber(4152313715839048L);
        Lupe_nieto.setBank_name("Banco Nieto");
        Lupe_nieto.setEmail("lupe@gmail.com");


do {
    option=Menu();
   if (option ==1)
       System.out.println("tu saldo es: "+Lupe_nieto.getBalance());


}while (option != 0);
      System.out.println("la opcion seleccionada es: "+ option);
    }





}
