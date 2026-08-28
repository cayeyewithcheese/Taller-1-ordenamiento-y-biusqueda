//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {5, 2, 4, 6, 1, 3};

        int[] ordenado = algoritmos.insertionSort(numeros);

        for (int numero : ordenado) {
            System.out.print(numero + " ");
        }
    }
}