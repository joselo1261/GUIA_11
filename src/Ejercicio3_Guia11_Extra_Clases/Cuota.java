
package Ejercicio3_Guia11_Extra_Clases;

public class Cuota {
    
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private String fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotalCuota, boolean pagada, String fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean pagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

        
}
