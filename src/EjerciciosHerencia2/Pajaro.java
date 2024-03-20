package EjerciciosHerencia2;

public class Pajaro extends Animal implements Informacion{

    private String especie;

    public Pajaro(String especie) {
        this.especie = especie;
    }

    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    void hacer_sonido() {
        System.out.println("El pajaro canta");
    }
    @Override
    public void informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
    }

}
