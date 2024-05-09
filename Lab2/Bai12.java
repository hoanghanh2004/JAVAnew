import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        int n, i, temp;
        Scanner sc = new Scanner(System.in);
            do {
                System.out.print("So phan tu cua mang la ");
                n = sc.nextInt();
                } while( n < 0);
                int A[] = new int[n];
            for (i = 0; i < n; i++)
                {
                    System.out.print("A[" + i + "]" + " = ");
                    A[i] = sc.nextInt();
                }
        sc.close();
        System.out.print("Mang ban dau la: ");
        for (i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        for( i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(A[i] > A[j])
                    {temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;}
                }
            }
        System.out.print("\nMang sap xep tang dan la: ");
        for (i = 0; i < n; i++)
            System.out.print(A[i] + " ");
    }
}