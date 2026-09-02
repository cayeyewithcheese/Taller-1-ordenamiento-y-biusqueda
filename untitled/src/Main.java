//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MisAlgoritmos algoritmos = new MisAlgoritmos();

        int[] numeros = {5, 10, 15, 20, 25};

        int posicion = algoritmos.linearSearch(numeros, 25);

        System.out.println("Posición: " + posicion);
    }
}