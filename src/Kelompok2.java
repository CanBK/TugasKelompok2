import java.util.Scanner;

public class Kelompok2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Deret Bilangan");
//        Deklarasi variabel yang digunakan
        String program = "";//variabel perulangan program
        String nama ="";
        String NIM="";
        int Angka=0; //variabel deret
        int bilGenap =0; //variabel untuk banyaknya bilangan genap
        int bilGanjil =0;//variabel untuk banyaknya bilangan ganjil
        int bilFib =0;//variabel untuk banyaknya bilangan fibonachi
        int deret =1; //variabel penampung angka yang akan dicetak
        int totalGenap = 0; //variabel Total bilangan Genap
        int totalGanjil= 0; //variabel Total bilangan Ganjil
        int totalFibo= 0; //variabel Total bilangan Fibonachi
//        Validasi ketika karakter nama kurang dari 1 atau lebih dari 25
        while (nama.length()<1 || nama.length()>25){
            System.out.print("Masukkan nama Anda [1 - 25 Karakter] : ");
            nama = scanner.nextLine();
        }
//        Validasi ketika karakter nim tidak sama dengan 10
        while (NIM.length()!=10){
            System.out.print("Masukkan NIM Anda [Harus 10 Karater] : ");
            NIM = scanner.nextLine();
        }

        System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Registrasi Berhasil");
        System.out.println("Selamat datang "+nama+"[ NIM : "+NIM+" ..^^v");
        System.out.println("Mari belajar macam - macam deret bilangan..");
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
//        Validasi ketika angka yang dimasukkan tidak 5-20
        while (Angka<5 || Angka > 20){
            System.out.print("Masukkan sembarang Angka [5..20] : ");
            Angka = scanner.nextInt();
        }
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Deret Bilangan");
        System.out.println("###############");
        System.out.println("20 Bilangan Genap : ");
        while (bilGenap<Angka){
            if(deret%2 ==0){
                System.out.print(deret+" ");
                totalGenap += deret;
                bilGenap++;
            }
            deret++;

        }
        System.out.println("\nTotal Bolangan Genap = "+totalGenap);
        deret =1;//Reset deret
        System.out.println("\n20 Bilangan Ganjil : ");
        while (bilGanjil<Angka){
            if(deret%2 ==1){
                System.out.print(deret+" ");
                totalGanjil += deret;
                bilGanjil++;
            }
            deret++;

        }
        System.out.println("\nTotal Bolangan Ganjil = "+totalGanjil);
        deret =1;//Reset deret
        int past = 0; //untuk menampung bbilangan sebelumnya
        System.out.println("\n20 Bilangan Fibonacci : ");
        while (bilFib<Angka){
            int current = deret + past;
            if(bilFib==0){
                System.out.print(deret+" ");
                totalFibo += deret;
            }else{
                System.out.print(current+" ");
                totalFibo += current;
                past = deret;
                deret = current;
            }

            bilFib++;
        }
        System.out.println("\nTotal Bilangan Fibonachi = "+totalFibo);
        System.out.print("\nAnda ingin mengulang [y/t] : ");
        scanner.nextLine();
        program = scanner.nextLine();
        if(program.equals("y")){
            main(args);
        }
    }
}
