import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size number");
        int arrayLength = scan.nextInt(); // вводим число = длине массива
        int array[] = new int[arrayLength]; // объявляем массив равный введенному числу


        System.out.print("Before sorting");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");

        }
        bubbleSort(array);

        System.out.println();
        System.out.print("After sorting");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,если они имеют неправильный порядок, то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

}

