package sorts;


//Сложность по времени: O(n^2)
//Сложность по памяти: O(1)
//Сортировка слиянием основана на сортировке пузырьком
//Возможная оптимизация: обход массива с двух сторон - "сортировка пузырьком с шейкерной сортировкой",
//но сложность все равно будет - O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        printArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            if (i > 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
