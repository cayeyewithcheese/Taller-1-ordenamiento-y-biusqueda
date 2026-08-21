//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MisAlgoritmos alg = new MisAlgoritmos();

        int[] datos = {5, 2, 8,1};

        int[] ordenado = alg.bubbleSort(datos);

        for (int num : ordenado) {
            System.out.print(num + " ");
        }

    }
}