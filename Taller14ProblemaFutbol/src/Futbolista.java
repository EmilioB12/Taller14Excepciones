import java.util.Scanner;

public class Futbolista extends Equipo implements iFutbolista {
    private int dorsal=0;
    private String posicion="";
    //private Equipo[] arregloEquipo = new Equipo[11];

    public Futbolista(String nombre, int edad, String cedula, int dorsal, String posicion) {
        super(nombre, edad, cedula);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public Futbolista() {
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    @Override
    public void ingresarFutbolista(){
        super.ingresarMiembro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dorsal del futbolista: ");
        this.dorsal= sc.nextInt();
        System.out.println("Ingrese la posicion del futbolista: ");
        this.posicion = sc.next();
    }
    @Override
    public void registroFutbolista(){
        super.registroMiembro();
        System.out.println("Dorsal: "+dorsal);
        System.out.println("Posicion: "+posicion);
    }
}
