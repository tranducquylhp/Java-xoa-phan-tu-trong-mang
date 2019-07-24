import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Nhap gia tri phan tu thu "+i+" = ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap phan tu muon xoa: ");
        int x = scanner.nextInt();
        for (int i=0; i<size;){
            if (arr[i] == x){
                for (int j=i; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[size-1] = 0;
                size--;
            } else i++;
        }
        System.out.println("Mang sau khi da xoa la: ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
