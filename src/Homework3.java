import java.util.Scanner;

public class Homework3 {
    public static void main(String[] arg) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
//        task7();
//        task8();
    }

    // Task1
    public static void task1() {
        System.out.println("Task #1");
        int[] arr = {0, 1, 0, 1, 1, 1, 0, 0};
        for (int a : arr) {
            if (a == 0) {
                int b = 1;
                System.out.println(b);
            } else {
                int b = 0;
                System.out.println(b);
            }
        }
    }


    // Task2
    public static void task2() {
        System.out.println("Task #2");
        int[] arr = new int[100];
        ref(arr);
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    public static void ref(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }
    }


    // Task3
    public static void task3() {
        System.out.println(" ");
        System.out.println("Task #3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a : arr) {
            if (a < 6) {
                int b = a * 2;
                System.out.print(b + " ");
            } else {
                System.out.print(a + " ");
            }
        }
    }


    // Task4
    public static void task4() {
        System.out.println(" ");
        System.out.println("Task #4");
        int[][] arr = new int[3][3];
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = 1;
            }
        }
        System.out.println("Task is done");
    }


    // Task5
    public static void task5() {
        System.out.println("Task #5");
        System.out.println("Input first value");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        scan.nextLine();
        System.out.println("Input second value");
        int initialValue = scan.nextInt();

        int[] arr = new int[len];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = initialValue;
            System.out.print(arr[a] + " ");
        }
    }


    // Task6 - логику посмотрела в интернете, но я разобралась :) 
    public static void task6() {
        System.out.println(" ");
        System.out.println("Task #6");
        int[] arr = {5, 6, 23, 56, 6, 1, 3, 18};
        int max = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }
        System.out.println("Maximum number is " + max);
    }
}
