/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeperformancejavaquicksort;

/**
 *
 * @author victorrocha
 */
public class TestePerformanceJavaQuickSort {

    public static void main(String[] args) {
        int[] actual = {25, 73, 14, 86, 59, 39, 41, 92, 68, 10, 31, 57, 82, 7, 63, 49, 18,
        96, 12, 52, 30, 67, 44, 23, 80, 5, 78, 61, 28, 97, 15, 72, 36, 64, 20, 54, 89, 33, 70, 9, 46, 81,
        22, 98, 13, 55, 26, 69, 2, 87, 45, 79, 50, 17, 93, 37, 62, 21, 85, 3, 71, 43, 91, 11, 66, 48, 1,
        77, 24, 58, 8, 32, 65, 19, 95, 16, 75, 40, 6, 83, 27, 53, 34, 74, 38, 94, 4, 76, 29, 56, 35,
        90, 51, 60, 88, 42, 84, 39, 82, 17, 64, 93, 51, 25, 78, 5, 49, 71, 12, 56, 30, 87, 19, 68, 44,
        9, 63, 33, 76, 22, 96, 60, 15, 45};
        mergeSort(actual, actual.length);
        for (int i = 0; i < actual.length; i++) {
            System.out.println(actual[i]);
        }
        
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
 
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
