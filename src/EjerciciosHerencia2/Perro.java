package EjerciciosHerencia2;

public class Perro extends Animal implements Informacion{
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, int edad, String genero, String raza) {
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
    public void informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Raza: "+raza);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
    }

    @Override
    void hacer_sonido() {
        System.out.println("El perro ladra");
    }
}
