import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int us=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int n=inp.nextInt();
        System.out.print("Kuvveti giriniz: ");
        int k=inp.nextInt();
        for (int i = 1; i <=k ; i++)
            us=us*n;
        System.out.println("Cevap: "+us);

    }
}
