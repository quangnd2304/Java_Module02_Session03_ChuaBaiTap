import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Xoa phan tu trong mang
        //B1. Khai bao va khoi tao gia tri cho mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap gia tri phan tu thu %d:",(i+1));
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mang truoc khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
        //B2. Xoa phan tu trong mang
        //B2.1. Cho phep nhap chi so phan tu can xoa
        System.out.println("Nhap vao chi so phan tu can xoa: ");
        int index = Integer.parseInt(sc.nextLine());
        //B2.2.Khoi tao mang moi - khong gom phan tu co chi so la index
        int[] arrIntNew = new int[n-1];
        //B2.3. copy cac phan tu tu arrInt sang arrIntNew tru phan tu co chi so la index
        for (int i = 0; i < n; i++) {
            if (i<index){
                arrIntNew[i] = arrInt[i];
            } else if (i==index) {
                continue;
            }else{
                arrIntNew[i-1] = arrInt[i];
            }
        }
        System.out.println("Mang sau khi xoa: ");
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d\t",arrIntNew[i]);
        }
        System.out.printf("\n");
    }
}