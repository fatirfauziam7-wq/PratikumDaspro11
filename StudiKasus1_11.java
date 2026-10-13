import java.util.Scanner;
public class StudiKasus1_11 {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
int hargaperCup = 18000,jumlahCup,uangBayar,totalHarga,diskon,totalBayar,kembalian,kurang;
System.out.println ("Masukkan jumlah cup : ");
jumlahCup = sc.nextInt ();
System.out.println ("Masukkan uang bayar : ");
uangBayar = sc.nextInt() ;
totalHarga = jumlahCup*hargaperCup ;
diskon = 0;
if (totalHarga >= 100000){
    diskon = totalHarga *10/100;
} else {
diskon = 0;
}
totalBayar = totalHarga-diskon;
System.out.println ("Total harga = Rp" + totalHarga);
System.out.println ("JUmlah diskon = Rp"+diskon);
System.out.println ("Harga yang perlu dibayar ="+totalBayar);
if (uangBayar >= totalBayar){
    kembalian = uangBayar - totalBayar;
    System.out.println ("Jumlah kembalian = Rp"+kembalian);
} else {
    kurang = totalBayar - uangBayar;
    System.out.println ("Uang tidak cukup,kurang Rp"+kurang);
}
sc.close();
    }
}
