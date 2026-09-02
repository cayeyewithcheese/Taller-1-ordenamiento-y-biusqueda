public class MisAlgoritmos implements Busquedas,Ordenamientos {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
            for (int i = 0; i < arrayPorExplorar.length; i++) {

                if (arrayPorExplorar[i] == elementoABuscar) {
                    return i;
                }
            }

            return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        return 0;
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
        quickSortAux(arrayDesordenado, 0, arrayDesordenado.length - 1);
        return arrayDesordenado;
    }

    private void quickSortAux(int[] arreglo, int inicio, int fin) {

        if (inicio < fin) {

            int pivote = particion(arreglo, inicio, fin);

            quickSortAux(arreglo, inicio, pivote - 1);
            quickSortAux(arreglo, pivote + 1, fin);
        }
    }

    private int particion(int[] arreglo, int inicio, int fin) {

        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {

            if (arreglo[j] <= pivote) {

                i++;

                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
}

