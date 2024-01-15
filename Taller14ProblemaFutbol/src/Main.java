import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Futbolista[] arregloFutbolista = new Futbolista[2];
            for (int i = 0; i <= 1; i++) {
                arregloFutbolista[i].ingresarFutbolista();
                arregloFutbolista[i] = new Futbolista();
            }
            for (int i = 0; i <= 1; i++) {
                arregloFutbolista[i].registroFutbolista();
            }
        }catch(NullPointerException | ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("Ingreso de datos no valido");
        }
    }
}
