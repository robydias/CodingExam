package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int in, out;
        for(out=1; out<array.length; out++)
        {
            int temp = array[out];
            in = out;
            while(in>0 && array[in-1] >= temp)
            {
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int out, in;
        for(out=array.length-1; out>1; out--)
            for(in=0; in<out; in++)
                if( array[in] > array[in+1] )
                {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here
        if (list.length > 1) {
            // split array into two halves
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }

        return list;
    }
    // left half
    public int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    // right half
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    // result
    public void merge(int[] result,
                      int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    public int[] quickSort(int[] array,int low, int high) {
        int[] list = array;
        //implement here

        if(low < high) {
            int next = partition(array, low, high);
            quickSort(array, low, next - 1);
            quickSort(array, next + 1, high);
        }
        return list;
    }
        public int partition(int array[], int p, int r){
            int part = p-1;
            int pivot = array[r];
            for(int i=p; i <= r; i++){
                if(array[i] <= pivot){
                    part++;
                    if(part != i){
                        array[part] = array[part] ^ array[i];
                        array[i] = array[part] ^ array[i];
                        array[part] = array[part] ^ array[i];
                    }
                }
            }
            return part;
        }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here

        int maxVal = getMax(list);
        int[] bucket = new int[maxVal+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }
        int outPos = 0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                array[outPos++] = i;
            }
        }
        return list;
    }
    public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0)
        {
            for(outer=h; outer<array.length; outer++)
            {
                temp = list[outer];
                inner = outer;
                while(inner > h-1 && list[inner-h] >= temp)
                {
                    list[inner] = list[inner-h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h-1) / 3;
        }

        return list;
    }
}
