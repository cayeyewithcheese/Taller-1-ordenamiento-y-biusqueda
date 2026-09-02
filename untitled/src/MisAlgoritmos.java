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

        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (arrayPorExplorar[medio] == elementoABuscar) {
                    return medio;
            }

            if (arrayPorExplorar[medio] < elementoABuscar) {
                    inicio = medio + 1;
            } else {
                    fin = medio - 1;
            }
        }

            return -1;
    }


    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 0; i < arrayDesordenado.length - 1; i++) {

            for (int j = 0; j < arrayDesordenado.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temporal = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temporal;
                }
            }
        }

            return array;
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

            int temp = arrayDesordenado[i];
            arrayDesordenado[i] = arrayDesordenado[indiceMenor];
            arrayDesordenado[indiceMenor] = temp;
        }

        return arrayDesordenado;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {

        for (int i = 1; i < arrayDesordenado.length; i++) {

            int clave = arrayDesordenado[i];
            int j = i - 1;

            while (j >= 0 && arrayDesordenado[j] > clave) {

                    arrayDesordenado[j + 1] = arrayDesordenado[j];
                    j--;
            }

                arrayDesordenado[j + 1] = clave;
        }

        return arrayDesordenado;
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

