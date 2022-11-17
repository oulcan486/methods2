package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kullanici="Ahmet";
		Ekle(kullanici);
		Guncelle(kullanici);
		Sil(kullanici);
		
		String yeniKullanici=kelimeParcala(kullanici);
		System.out.println(yeniKullanici);
		
		int topla=Sum(5, 7);
		System.out.println(topla);
		
		int topla2=Topla2(3,45,22,67,98);
		System.out.println(topla2);

	}
	
	public static void Ekle(String kullanici) {
		System.out.println(kullanici);
	}
	
	public static void Guncelle(String kullanici) {
		System.out.println(kullanici+" Hosgeldiniz");
	}
	
	public static void Sil(String kullanici) {
		System.out.println(kullanici+ " Silindi");
	}
	
	public static String kelimeParcala(String kullanici) {
		return kullanici.substring(0, 3);
	}
	
	public static int Sum(int number1,int number2) {
		return number1+number2;
	}
	
	public static int Topla2(int... sayilar) {//Variable Arguments ile istediğimiz kadar değeri parametre olarak gönderebiliriz...
     int  toplam=0;
      for (int sayi : sayilar) {
		toplam+=sayi;
	  }
      
      return toplam;
	}

}
