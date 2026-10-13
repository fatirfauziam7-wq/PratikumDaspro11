import java.util.Scanner;

public class StudiKasus2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("jenis kegiatan (BELMAWA / BAKORMA / MANDIRI / PKM / LAINNYA): ");
        String jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("peringkat Juara : ");
            int peringkat = sc.nextInt();

    