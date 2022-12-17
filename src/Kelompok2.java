import java.util.Scanner;

public class Kelompok2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Deret Bilangan");

        // deklarasi variabel inputan nama dan NIM
        String nama ="";
        String NIM="";

        // deklarasi variabel perulangan program input bilangan
        int loop;

        // validasi ketika karakter nama kurang dari 1 atau lebih dari 25
        while (nama.length()<1 || nama.length()>25){
            System.out.print("Masukkan nama Anda [1 - 25 Karakter] : ");
            nama = scanner.nextLine();
        }

        // validasi ketika karakter nim tidak sama dengan 10
        while (NIM.length()!=10){
            System.out.print("Masukkan NIM Anda [Harus 10 Karater] : ");
            NIM = scanner.nextLine();
        }

        // menampilkan data user (nama dan NIM) setelah berhasil register
        System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("Registrasi Berhasil");
        System.out.println("Selamat datang "+nama+" [ NIM : "+NIM+" ..^^v");
        System.out.println("Mari belajar macam - macam deret bilangan..");
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

        // menambahkan nilai loop untuk memulai program menghitung bilangan
        loop = 1;

        // do while perulangan program bilangan jika loop > 0
        do {
            int Angka=0;        // variabel deret
            int bilGenap =0;    // variabel untuk banyaknya bilangan genap
            int bilGanjil =0;   // variabel untuk banyaknya bilangan ganjil
            int bilFib =0;      // variabel untuk banyaknya bilangan fibonachi
            int deret =1;       // variabel penampung angka yang akan dicetak
            int totalGenap = 0; // variabel Total bilangan Genap
            int totalGanjil= 0; // variabel Total bilangan Ganjil
            int totalFibo= 0;   // variabel Total bilangan Fibonachi

            // validasi ketika angka yang dimasukkan tidak 5-20
            while (Angka<5 || Angka > 20){
                System.out.print("Masukkan sembarang Angka [5..20] : ");
                Angka = scanner.nextInt();
            }

            // menghitung bilangan genap
            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Deret Bilangan");
            System.out.println("###############");
            System.out.println(Angka+ " Bilangan Genap : ");
            while (bilGenap<Angka){
                if(deret%2 ==0){
                    System.out.print(deret+" ");
                    totalGenap += deret;
                    bilGenap++;
                }
                deret++;

            }

            // menampilkan bilangan genap
            System.out.println("\nTotal Bilangan Genap = "+totalGenap);

            // menghitung bilangan ganjil
            deret =1;//Reset deret
            System.out.println("\n" +Angka+ " Bilangan Ganjil : ");
            while (bilGanjil<Angka){
                if(deret%2 ==1){
                    System.out.print(deret+" ");
                    totalGanjil += deret;
                    bilGanjil++;
                }
                deret++;

            }

            // menampilkan bilangan ganjil
            System.out.println("\nTotal Bilangan Ganjil = "+totalGanjil);

            // reset deret
            deret =1;

            // menampung bilangan sebelumnya
            int past = 0;

            // menghitung bilangan fibonacci
            System.out.println("\n" +Angka+ " Bilangan Fibonacci : ");
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

            // menampilkan bilangan fibonacci
            System.out.println("\nTotal Bilangan Fibonacci = "+totalFibo);

            // question to user untuk mengulanng program bilangan
            System.out.print("\nAnda ingin mengulang [y/t] : ");
            scanner.nextLine();
            String program = scanner.nextLine();

            // pengecekan apakah user akan mengulang atau tidak
            if(program.equals("y") || program.equals("Y")){
                // jika ya (Y/y) maka nilai loop akan bertambah dan program akan mengulang
                loop++;
            } else {
                // jika selain ya maka nilai loop akan reset ke 0 dan program akan berakhir
                loop = 0;
            }
        } while (loop > 0);

    }
}
