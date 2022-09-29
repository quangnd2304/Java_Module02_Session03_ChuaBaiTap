import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //B1. Nhap vao mot chuoi va 1 ky tu can tim trong chuoi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str = sc.nextLine();
        System.out.println("Nhap vao ky tu can tim trong chuoi: ");
        char c_search = sc.nextLine().charAt(0);
        //B2. Duyet cac ky tu trong chuoi str va dem so ky tu c_search
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c_search){
                cnt++;
            }
        }
        //B3. In ra so ky tu co trong chuoi
        System.out.printf("Ky tu '%c' xuat hien %d trong chuoi '%s'\n",c_search,cnt,str);

    }
}