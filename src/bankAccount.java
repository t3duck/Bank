public class bankAccount {
private String name;
private Double Balance;
private long Cardnumber;
private String Bank_name;
private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public long getCardnumber() {
        return Cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        Cardnumber = cardnumber;
    }

    public String getBank_name() {
        return Bank_name;
    }

    public void setBank_name(String bank_name) {
        Bank_name = bank_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;



    }

    public String toString(){
        System.out.println("los datos del cuenta habiente son: ");
        System.out.println("nombre: " + getName());
        System.out.println("el balance es: " + getBalance());
        System.out.println("el numero de tarjeta  es: " + getCardnumber());
        System.out.println("el nombre del banco  es: " + getBank_name());
        System.out.println("el correo del cliente es: "+ getEmail());
        return "";

    }

  public  void depositar (double cantidad) {
      Balance += cantidad;
  }
  public void retirar (double cantidad){
        Balance-=cantidad;
  }
}
