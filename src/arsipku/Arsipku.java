package arsipku;
public class Arsipku implements Kelompok, Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
        ar.namaKelompok();
    }
    
    public void namaKelompok(){
        System.out.println("----- Nama Kelompok -----");
        System.out.println("1. Didik Setiawan");
        System.out.println("2. Gayuh Sukma Pramuaji");
        System.out.println("3. Dwi Putri W.G");
        System.out.println("4. Maghfiro Nur Eka S");
        System.out.println("5. Choiriyatuz Zahro");
        System.out.println("6. Dela Maharani");
        System.out.println("7. Lelita Amelia Sari");
    }

   public void nama(){
       System.out.println("----- Biodata -----");
       System.out.println("Namaku = Didicks Setyaone");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Jember");
   }
   
   public void hobi(){
       System.out.println("Hobi = Mobile Legends Bang Bang");   
   }
   
   public void agama(){
       System.out.println("----- Nilai -----");
       System.out.println("Agama = 100");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 100");
   }
   
   public void matematika(){
       System.out.println("Matematika = 100");
   }
    
}
