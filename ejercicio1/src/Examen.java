public class Examen {
    private String titulo;
    private double nota;

    private static String asignatura;

    public Examen(String titulo) {
        this.titulo = titulo;
    }



    public String getTitulo() {
        return titulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) throws Exception{
        if (nota<0 ||nota>10){
            throw new Exception("la nota no puede ser inferior a 0 ni mayor a 10");
        }else {
            this.nota =  nota;
        }
    }

    public static String getAsignatura() {
        return asignatura;
    }

    public static void setAsignatura(String asignatura) {
        Examen.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return asignatura +'-'+ titulo + '-' + nota ;
    }


    public double redondear(){
        this.nota = Math.round(nota);
        return nota;
    }

    public boolean estaAprobado(){
        if (this.nota>=5){
            return true;
        }else {
            return false;
        }
    }



}
