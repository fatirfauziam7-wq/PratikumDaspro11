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

    
        