package Banco;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;


    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public String getNombreTitular() {return nombreTitular;}
    public void setNombreTitular(String nombreTitular) { this.nombreTitular = nombreTitular;}
    public long getNumeroCuenta() {return numeroCuenta;}
    public void setNumeroCuenta(long numeroCuenta) {this.numeroCuenta = numeroCuenta;}


    public CuentaCorriente(String nombreTitular,double saldo) {
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
        this.numeroCuenta= (long)(Math.random()*999999);
    }


    public void setIngreso(double ingreso){
        if (ingreso<=0)
            System.out.println("El valor debe ser mayor a cero");
        else
            saldo=saldo+ingreso;
    }

    public void setReintegro(double reintegro)
    {
        if (reintegro<=0)
            System.out.println("El valor debe ser mayor a cero");
        else
            saldo =saldo-reintegro;
    }

    public static void Transferencia(CuentaCorriente c1, CuentaCorriente c2, double importe)
    {
        c1.saldo=c1.saldo-importe;
        c2.saldo=c2.saldo+importe;
    }

    public static void getDatos(CuentaCorriente c1){
        System.out.println("El número de cuenta de "+c1.getNombreTitular()+" es "+c1.numeroCuenta+" y el saldo es de $"+c1.getSaldo());
    }
}
