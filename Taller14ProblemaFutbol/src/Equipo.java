import java.util.InputMismatchException;
import java.util.Scanner;

public class Equipo implements iEquipo{
    private String nombre="";
    private int edad=0;
    private String cedula="";

    public Equipo(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public void ingresarMiembro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un miembro del equipo: ");
        this.nombre= sc.next();
        System.out.println("Ingrese la edad de un miembro del equipo: ");
        this.edad = sc.nextInt();
        System.out.println("Ingrese la cedula de un miembro del equipo: ");
        this.cedula= sc.next();
    }
    @Override
    public void registroMiembro(){
        System.out.println("El nombre del miembro del equipo es: "+nombre);
        System.out.println("La edad del miembro del equipo es: "+edad);
        System.out.println("La cedula del miembro del equipo es: "+cedula);
    }
}
