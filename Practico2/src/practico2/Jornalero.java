package practico2;

public class Jornalero extends Funcionario {

    private int horasTrabajadas;
    private double valorHora;
    
    public Jornalero(String nombre, String ci, int horasTrabajadas, double valorHora) {
        super(nombre, ci);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.valorHora;
    }
    
}
