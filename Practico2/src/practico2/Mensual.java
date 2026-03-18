package practico2;

public class Mensual extends Funcionario {
    
    private double sueldoMensual;

    public Mensual(String nombre, String ci, double sueldo) {
        super(nombre, ci);
        this.sueldoMensual = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoMensual;
    }
    
}
