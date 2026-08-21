//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {2, 5, 6, 12, 15, 20, 25};

        int elemento = 15;

        int posicion = algoritmos.binarySearch(numeros, elemento);
            System.out.println("Posicion : " + posicion);

    }
}