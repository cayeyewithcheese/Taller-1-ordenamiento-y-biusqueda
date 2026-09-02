//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {5, 1, 4, 2, 8};

        int[] resultado = algoritmos.bubbleSort(numeros);

        for (int n : resultado) {
            System.out.print(n + " ");
        }
    }
}