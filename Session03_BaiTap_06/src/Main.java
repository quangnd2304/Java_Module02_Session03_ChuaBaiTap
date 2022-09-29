import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //B1. Khai bao va khoi tao mang 2 chieu so thuc
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot cua ma tran: ");
        int m = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("NHAP GIA TRI CAC PHAN TU CUA MA TRAN:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        //B2. Nhap vao chi so cot can tinh tong va tinh tong
        System.out.println("Nhap vao chi so cot cua ma tran can tinh tong: ");
        int colIndex = Integer.parseInt(sc.nextLine());
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=matran[i][colIndex];
        }
        //B3. In ra tong cot colIndex
        System.out.printf("Tong gia tri cac phan tu nam tren cot %d la: %f\n",colIndex,sum);
    }
}