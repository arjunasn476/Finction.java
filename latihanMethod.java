import java.util.Scanner;

public class latihanMethod {

    static void myMethod(int angkaA, int angkaB,int jumlah){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka a: ");
        angkaA = input.nextInt();
        System.out.println("masukkan angka b: ");
        angkaB = input.nextInt();
        jumlah = angkaA + angkaB;
        System.out.println(jumlah);
      }

      
    static void mYmethod(int angkaA, int angkaB,int jumlah){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka a: ");
        angkaA = input.nextInt();
        System.out.println("masukkan angka b: ");
        angkaB = input.nextInt();
        jumlah = angkaA - angkaB;
        System.out.println("hasilnya "+jumlah);
    }

    static void Mymethod(int angkaA, int angkaB,int jumlah){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka a: ");
        angkaA = input.nextInt();
        System.out.println("masukkan angka b: ");
        angkaB = input.nextInt();
        jumlah = angkaA * angkaB;
        System.out.println("hasilnya "+jumlah);
    }

    static void mymethod(int angkaA, int angkaB,int jumlah){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka a: ");
        angkaA = input.nextInt();
        System.out.println("masukkan angka b: ");
        angkaB = input.nextInt();
        jumlah = angkaA / angkaB;
        System.out.println("hasilnya "+jumlah);
    }


    public static void main(String[] args) {
        myMethod(0, 0, 0);
        mYmethod(0, 0, 0);
        Mymethod(0, 0, 0);
        mymethod(0, 0, 0);
    }
}