package EjerciciosHerencia2;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bobby",4,"Macho","Dobberman");
        Gato gato1 = new Gato("Michi",8,"Macho","Siames");
        Pajaro pajaro1 = new Pajaro("Piolin",1,"Hembra","Siete cuchillos");

        perro1.informacion();
        perro1.hacer_sonido();

        System.out.println("---------------------------------------------------");

        gato1.informacion();
        gato1.hacer_sonido();

        System.out.println("---------------------------------------------------");

        pajaro1.informacion();
        pajaro1.hacer_sonido();
    }
}
