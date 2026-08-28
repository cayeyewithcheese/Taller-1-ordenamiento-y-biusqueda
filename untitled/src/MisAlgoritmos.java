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
    public int[] selectionSort(int[] arrayDesordenado) { return new int[0];}

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        for (int i = 1; i < arrayDesordenado.length; i++){
            int clave = arrayDesordenado[i];
            int j = i - 1;

            while (j >= 0 && arrayDesordenado[j] > clave){
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
        return new int[0];
    }
}
