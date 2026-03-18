package practico2;

import java.util.Objects;

public abstract class Funcionario implements Comparable<Funcionario> {
    private String nombre;
    private String ci;

    public Funcionario(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public abstract double calcularSueldo();

    @Override
    public boolean equals(Object obj) {
        Funcionario f = (Funcionario) obj;
        
        return this.ci.equals(f.ci);
    }
    
    public boolean ganaMas(Funcionario otro){
        return this.calcularSueldo() > otro.calcularSueldo();
    }
    
    
    // f1.ganaMas(f2)

    @Override
    public int compareTo(Funcionario o) {
        return (int)(this.calcularSueldo() - o.calcularSueldo());
//        if(this.ganaMas(o)) return 1;
//        if(o.ganaMas(this)){
//            return -1;
//        }else{
//            return 0;
//        }
    }
    
    // f1.compareTo(f2)
    // Si retorna 0, f1 y f2 son iguales
    // Si retorna x < 0, f1 es más chico que f2
    // Si retorna x > 0, f1 es más grande que f2
}
