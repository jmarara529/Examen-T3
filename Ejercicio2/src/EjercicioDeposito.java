public class EjercicioDeposito {

    public static void main(String[] args) {

        Deposito deposito = new Deposito(25);

        Enum<Contenido> contenidoEnum;

        System.out.println(deposito);
        System.out.println("Deposito vacio:");
        System.out.println(deposito.estaVacio());

    }

}
