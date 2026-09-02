//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {64, 25, 12, 22, 11};

        int[] resultado = algoritmos.selectionSort(numeros);

        for (int n : resultado) {
            System.out.print(n + " ");
        }
    }
}