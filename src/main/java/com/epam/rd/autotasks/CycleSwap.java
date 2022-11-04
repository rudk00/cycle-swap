package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    public static void main(String[] args) {
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void cycleSwap(int[] array) {
        int[] ar = new int[array.length];
        if (array.length != 0) {
            System.arraycopy(array, 0, ar, 0, ar.length);
            System.arraycopy(array, 0, ar, 1, ar.length - 1);
            System.arraycopy(array, array.length - 1, ar, 0, 1);
            System.arraycopy(ar, 0, array, 0, ar.length);
        }
    }
    public static void cycleSwap(int[] array, int shift) {
        int[] ar = new int[array.length];
        if (array.length != 0) {
            System.arraycopy(array, 0, ar, 0, ar.length);
            System.arraycopy(array, ar.length - shift, ar, 0, shift);
            System.arraycopy(array, 0, ar, shift, ar.length - shift);
            System.arraycopy(ar, 0, array, 0, ar.length);
        }
    }
}
