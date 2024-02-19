package Ejercicio_2;

public class Cuenta {

    protected float saldo;
    protected int numConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comision;

    /**
     * Constructor de la clase Cuenta
     * 
     * @param cantidad : float
     * @param tasaAnual : float
     */

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        numConsignaciones = 0;
        numeroRetiros = 0;
        comision = 0;
    }

    /**
     * Consigna una cantidad a la cuenta
     * @param cantidad : float
     */

    public void consignar(float cantidad) {
        this.saldo = cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad : float
     */

    public void retirar(float cantidad) {
        if (cantidad <= this.saldo) {
            saldo -= cantidad;
        }
    }

    /**
     * Calcula el interes mensual de la cuenta
     * TasaAnual 12% => tasaAnual = 12
     */

    public void calcularInteres(){
        float cantidad = saldo*this.tasaAnual/100;
        saldo=saldo+(cantidad/12);
        System.out.println("Interes mensual: "+cantidad);
    }

    public void estractoMensual(){
        calcularInteres();
        saldo=saldo-comision;
    }

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numConsignaciones=" + numConsignaciones + ", numeroRetiros="
				+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comision=" + comision + "]";
	}

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }


}
