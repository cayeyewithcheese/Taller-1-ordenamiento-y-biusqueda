public class MisAlgoritmos implements Busquedas,Ordenamientos{
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {return 0;}

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {return 0;}


    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        return new int[0];
    }


    @Override
    public int[] selectionSort(int[] arrayDesordenado) {


        int n = arrayDesordenado.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {

                if (arrayDesordenado[j] < arrayDesordenado[indiceMenor]) {
                            indiceMenor = j;
                }
            }

            int temporal = arrayDesordenado[i];
            arrayDesordenado[i] = arrayDesordenado[indiceMenor];
            arrayDesordenado[indiceMenor] = temporal;
        }

        return arrayDesordenado;

    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
