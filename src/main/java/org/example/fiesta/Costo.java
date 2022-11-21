package org.example.fiesta;

public class Costo {

    // Atributos
    private String fecha;
    private double CostoLugar;
    private double  costoBebidas;
    private double costoAlimentos;
    private double costoEquipos;

    // contructor

    public Costo() {
    }

    public Costo(String fecha, double costoLugar, double costoBebidas, double costoAlimentos, double costoEquipos) {
        this.fecha = fecha;
        CostoLugar = costoLugar;
        this.costoBebidas = costoBebidas;
        this.costoAlimentos = costoAlimentos;
        this.costoEquipos = costoEquipos;
    }

    // get y set
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCostoLugar() {
        return CostoLugar;
    }

    public void setCostoLugar(double costoLugar) {
        CostoLugar = costoLugar;
    }

    public double getCostoBebidas() {
        return costoBebidas;
    }

    public void setCostoBebidas(double costoBebidas) {
        this.costoBebidas = costoBebidas;
    }

    public double getCostoAlimentos() {
        return costoAlimentos;
    }

    public void setCostoAlimentos(double costoAlimentos) {
        this.costoAlimentos = costoAlimentos;
    }

    public double getCostoEquipos() {
        return costoEquipos;
    }

    public void setCostoEquipos(double costoEquipos) {
        this.costoEquipos = costoEquipos;
    }
}
