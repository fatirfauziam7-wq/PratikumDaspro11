import java.util.Scanner;
public class StudiKasus2_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenis;
        int dokumen, juara, statusPKM;
        System.out.println("Masukkan Nama Mahasiswa :");
nama = sc.nextLine ();
System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA):");
jenis = sc.nextLine ();
if (jenis.equalsIgnoreCase("BELMAWAN") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase ("MANDIRI")){
    System.out.println("Masukkkan jumlah dokumen :");
    dokumen = sc.nextInt();
    System.out.println("Masukkan peringkat juara :");
    juara = sc.nextInt();
if (dokumen <4){
    System.out.println("Status : Dokumen tidak lengkap (kurang "+(4-dokumen)+"dokumen) Dana penghargaan tidak diberikan.");
} else {
    if (juara >= 1 && juara <= 3 ){
        System.out.println("Status : Berhak memperorlah dana pengharggan (Juara" +juara+").");
    } else {
System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3)");
    }
}
    } else if (jenis.equalsIgnoreCase ("PKM")) {
        System.out.println("Jumlah dokumen :");
        dokumen = sc.nextInt ();
        System.out.println("Status Pendanaan PKM  (1=lolos,0=tidak lolos):");
        statusPKM = sc.nextInt ();
     if (dokumen <4 ){
        System.out.println("Status : Dokumen tidak lengkap (kurang" + (4-dokumen)+"dokumen)Dana penghargaan tidak diberikan ");
    } else {
        if (statusPKM == 1) {
        System.out.println ("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan)");
        } else {
            System.out.println ("Status : Tidak memperoleh  dana penghargaan (PKM tidak lolos pendanaan)");
            } 
                }
} else {
System.out.println ("Tidak memperoleh penghargaan (Jenis kegiatan tidak termkasud ketentuan )");
    }
    }
}
    
        