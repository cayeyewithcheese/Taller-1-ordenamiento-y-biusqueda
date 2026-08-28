public class MisAlgoritmos implements Busquedas,Ordenamientos {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        return 0;
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
        if (arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }
        int mitad = arrayDesordenado.length / 2;
        int[] izquierda = new int[mitad];
        int[] derecha = new int[arrayDesordenado.length - mitad];
        for (int i = 0; i < mitad; i++) {
            izquierda[i] = arrayDesordenado[i];
        }
        for (int i = mitad; i < arrayDesordenado.length; i++) {
            derecha[i - mitad] = arrayDesordenado[i];
        }
        izquierda = mergeSort(izquierda);
        derecha = mergeSort(derecha);

        return merge(izquierda, derecha);
    }

    private int[] merge(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }
        return resultado;
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}

