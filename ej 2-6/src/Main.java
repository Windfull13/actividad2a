import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int altura1;
        int altura2;
        int altura3;
        int altura4;
        int orden1=0;
        int orden2=0;
        int orden3=0;
        int orden4=0;
        int aux=0;
        screen.println("Ingrese la primer altura en cm: ");
        altura1=keyboard.nextInt();
        screen.println("Ingrese la segunda altura en cm: ");
        altura2=keyboard.nextInt();
        screen.println("Ingrese la tercera altura en cm: ");
        altura3=keyboard.nextInt();
        screen.println("Ingrese la cuarta altura en cm");
        altura4=keyboard.nextInt();
        orden1=altura1;
        orden2=altura2;
        orden3=altura3;
        orden4=altura4;
        if(orden1>orden2){
            aux=orden1;
            orden1=orden2;
            orden2=aux;
        }
        if (orden2>orden3){
            aux=orden2;
            orden2=orden3;
            orden3=aux;
        }
        if (orden3>orden4){
            aux=orden3;
            orden3=orden4;
            orden4=aux;
        }
        if (orden1>orden2) {
            aux=orden1;
            orden1=orden2;
            orden2=aux;
        }
        if (orden2>orden3){
            aux=orden2;
            orden2=orden3;
            orden3=aux;
        }
        if (orden1>orden2){
            aux=orden1;
            orden1=orden2;
            orden2=aux;
        }
        screen.println("El orden ascendente de las alturas mencionadas es : " +orden1+" cm, " +orden2+ " cm, " +orden3+" cm y " +orden4+ " cm");
    }
}