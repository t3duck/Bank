public class Sneaker {
    private String color;
    private String marca;
    private String suela;
    private int talla;


    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        this.marca = marca;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela() {
        this.suela = suela;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla() {
        this.talla = talla;
    }


    public String toString(){
        System.out.println("los datos del sneaker son: ");
        System.out.println("el color es: " + getColor());
        System.out.println("la marca es: " + getMarca());
        System.out.println("la suela es: " + getSuela());
        System.out.println("La talla es:  " + getTalla());
        return "";

    }


}
