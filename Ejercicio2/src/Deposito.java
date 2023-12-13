public class Deposito {
    private int capacidad;
    private Contenido contenido;

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
        this.contenido = Contenido.agua;
    }

    public Deposito(int capacidad, Contenido contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Deposito de " + contenido + "("+ capacidad +")";
    }

    public boolean estaVacio(){
        if (this.capacidad<=0){
            return true;
        }else {
            return false;
        }
    }



}
