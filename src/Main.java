public class Main {
    public static void main(String[] args) {

        Persona individuo = new Persona();
        individuo.setEdad();
        individuo.setNombre();
        individuo.setTelefono();


        System.out.println(individuo.getEdad());
        System.out.println(individuo.getNombre());
        System.out.println(individuo.getTelefono());

    }
}