import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //B1. Khai bao va khoi tao gia tri cho mang 2 chieu so thuc
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot cua ma tran: ");
        int m = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("NHAP GIA TRI CAC PHAN TU CUA MA TRAN");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        //B2. Duyet mang 2 chieu tim gia tri lon nhat cua cac phan tu
        float max = matran[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max<matran[i][j]){
                    max = matran[i][j];
                }
            }
        }
        //B3. Duyet mang 2 chieu va in ra toa do, gia tri cua phan tu co gia tri = max
        System.out.println("TOA DO VA GIA TRI CAC PHAN TU CO GIA TRI LON NHAT LA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matran[i][j]==max){
                    System.out.printf("Toa do: (%d,%d) - Gia tri: %f\n",i,j,matran[i][j]);
                }
            }
        }
    }
}