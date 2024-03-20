package EjerciciosHerencia2;

public class Gato extends Animal implements Informacion{

    private String raza;

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    void hacer_sonido() {
        System.out.println("El gato maulla");
    }
    @Override
    public void informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
    }
}
