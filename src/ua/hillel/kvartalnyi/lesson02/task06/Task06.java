package ua.hillel.kvartalnyi.lesson02.task06;

public class Task06 {

    public static void main(String[] args) {
        int[] mas = {2, 0, 4, 9, 5, 3, 6, 8, 7, 33, 34};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
            System.out.println(sum);

    }
}