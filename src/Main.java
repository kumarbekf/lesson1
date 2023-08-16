import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] array = createRandomArray(10);

        System.out.print("Массив: ");
        printArray(array);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }


        System.out.print("ArrayList сорттолгон элементтер: ");
        printArray(sortArray(arrayList));

        System.out.print("LinkedList сорттолгон элементтер: ");
        printArray(sortArray(linkedList));
    }


    public static int[] sortArray(ArrayList<Integer> list) {
        Collections.sort(list);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static int[] sortArray(LinkedList<Integer> list) {
        Collections.sort(list);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.random() > 0.5 ? 1 : 0;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}