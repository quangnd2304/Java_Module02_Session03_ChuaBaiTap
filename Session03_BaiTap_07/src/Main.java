import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //B1. khai bao va khoi tao mang 2 chieu vuong
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong va so cot cua ma tran: ");
        int n = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][n];
        System.out.println("NHAP GIA TRI CAC PHAN TU CUA MA TRAN: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        //B2. In ra duong cheo chinh va tinh tong cac phan tu nam tren duong cheo chinh
        System.out.println("CAC PHAN TU NAM TREN DUONG CHEO CHINH LA: ");
        float sumChinh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    //Phan tu nam tren duong cheo chinh
                    System.out.printf("%f\t",matran[i][j]);
                    sumChinh+=matran[i][j];
                }
            }
        }
        System.out.printf("\n");
        System.out.println("Tong cac phan tu nam tren duong cheo chinh la: "+sumChinh);
        System.out.println("CAC PHAN TU NAM TREN DUONG CHEO PHU LA: ");
        float sumPhu = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1){
                    //Phan tu nam tren duong cheo phu
                    System.out.printf("%f\t",matran[i][j]);
                    sumPhu+=matran[i][j];
                }
            }
        }
        System.out.printf("\n");
        System.out.println("Tong cac phan tu nam tren duong cheo phu la: "+sumPhu);
    }
}