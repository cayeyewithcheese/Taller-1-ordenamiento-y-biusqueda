//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {5, 20, 25, 30, 35,40 };

        int posicion = algoritmos.binarySearch(numeros, 20);

        System.out.println("Posición: " + posicion);
    }
}