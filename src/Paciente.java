public class Paciente {


    private String nombre;
    private String Sexo;
    private double peso;
    private double estatura;

    private int Edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String toString(){
        System.out.println("los datos del paciente son: ");
        System.out.println("nombre: " + getNombre());
        System.out.println("el sexo es: " + getSexo());
        System.out.println("el peso es: " + getPeso());
        System.out.println("La estatura es:  " + getEstatura());
        System.out.println("La edad es:  " + getEdad());
        return "";

    }


    public void setPeso() {
    }


}
