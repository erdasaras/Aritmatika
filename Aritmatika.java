import java.util.Scanner;
public class Aritmatika
{
public static void main(String args[])
{
	int A,B,jumlah,kurang,kali,bagi,mod;
	Scanner masuk=new Scanner(System.in);
System.out.println("  Hasil Operator Aritmatika");
System.out.println("-----------------------------");
System.out.println("");
System.out.println("Bilangan 1 : 7");
A = 7;
System.out.println("Bilangan 2 : 2");
B = 2;
System.out.println("");
jumlah= A + B;
kurang= A - B;
kali= A * B;
bagi= A / B;
mod= A % B;
System.out.println("Penjumlahan = "+jumlah);
System.out.println("Pengurangan = "+kurang);
System.out.println("Perkalian  = "+kali );
System.out.println("Pembagian  = "+bagi );
System.out.println("Sisa   = "+mod);
}
}




