//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {38, 27, 43, 3, 9, 82, 10};

        int[] resultado = algoritmos.mergeSort(numeros);

        for (int n : resultado) {
            System.out.print(n + " ");
        }
    }
}