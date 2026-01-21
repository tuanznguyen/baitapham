package lec6arrays;

import java.util.Scanner;

public class bt1 {

    static void hienThiMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void daoNguocMang(int[] a, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void hienThiSoChan(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    static int tongChiaHetCho3Va5(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                tong += a[i];
            }
        }
        return tong;
    }

    static void sapXepTangDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void sapXepGiamDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("\nMang vua nhap:");
        hienThiMang(a, n);
        System.out.println("Mang dao nguoc:");
        daoNguocMang(a, n);
        System.out.println("Cac so chan:");
        hienThiSoChan(a, n);
        System.out.println("Tong chia het cho 3 va 5:");
        System.out.println(tongChiaHetCho3Va5(a, n));
        System.out.println("Mang tang dan:");
        sapXepTangDan(a, n);
        hienThiMang(a, n);
        System.out.println("Mang giam dan:");
        sapXepGiamDan(a, n);
        hienThiMang(a, n);
    }
}
