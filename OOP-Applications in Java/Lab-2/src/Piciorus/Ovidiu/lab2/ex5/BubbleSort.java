package Piciorus.Ovidiu.lab2.ex5;

public class BubbleSort {
    public static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 9 + 1);
            list[i] = n;
            System.out.println(list[i] + " ");
        }
        System.out.println(" ");
        bubble(list);
        for (int j = 0; j < 10; j++) System.out.println(list[j] + " ");

    }
}
