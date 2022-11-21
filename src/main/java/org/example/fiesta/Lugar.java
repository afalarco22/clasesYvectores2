package org.example.fiesta;

public class Lugar {
    //Atributos
    /*
    * Los atributos no se inicializan
    * los atributos se nombran iniciando con minúscula
    * */
    private String nombreLugar;
    private String direccion;
    private int aforo;
    // Contructores
    /*
    * El cosntructor se llama igual que la clase y es el único método que va en mayúscula inicial
    *
    * */
    public Lugar() {
    }

    public Lugar(String nombreLugar, String direccion, int aforo) {
        this.nombreLugar = nombreLugar;
        this.direccion = direccion;
        this.aforo = aforo;
    }

    /*
    * Los métodos get y set con el podemos inicializar atributos y obtenerlos en la clase main
    * para su uso
    * */
    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }


}
