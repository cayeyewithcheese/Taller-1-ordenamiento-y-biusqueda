//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {10, 7, 8, 9, 1, 5};

        int[] ordenado = algoritmos.quickSort(numeros);

        for (int numero : ordenado) {
            System.out.print(numero + " ");
        }
    }
}