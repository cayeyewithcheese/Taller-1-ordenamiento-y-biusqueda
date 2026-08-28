//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {38, 27, 43, 3, 8, 82, 11};

        int[] ordenado = algoritmos.mergeSort(numeros);

        for (int numero : ordenado) {
            System.out.print(numero + " ");
        }
    }
}