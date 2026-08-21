public class MisAlgoritmos implements Busquedas,Ordenamientos{
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {return 0;}

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {

        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arrayPorExplorar[medio] == elementoABuscar) {
                return medio;
            }
            if (arrayPorExplorar[medio] < elementoABuscar){
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }


    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        return new int[0];
    }


    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        return new int[0];
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
