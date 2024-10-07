import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
    	// Bu program, alfabenin her harfini belirli bir sayıda kaydırarak başka bir harfle değiştiren basit bir şifreleme yöntemidir.

        Scanner scanner = new Scanner(System.in);
        int secim = -1;

        System.out.println("Sezar Şifreleme ve Çözme Uygulaması");
        
        while (secim != 0) {  
            System.out.print("1) Sezar Şifreleme 2) Sezar Şifre Çözme 0) Çıkış\nYapmak istediğiniz işlemi seçiniz: ");
            secim = scanner.nextInt();
            scanner.nextLine(); 

            if (secim == 1 || secim == 2) {
                System.out.print("Metin giriniz: ");
                String metin = scanner.nextLine();

                System.out.print("Kaç karakter kaydırılacağını giriniz: ");
                int anahtar = scanner.nextInt();

                String sifreliMetin = "";
                String cozulenMetin = "";

                if(secim == 1) {
                    // Şifreleme
                    for(int i = 0; i < metin.length(); i++) {
                        char karakter = metin.charAt(i);
                        if (karakter != ' ') {
                            sifreliMetin += (char) (karakter + anahtar);
                        } 
                        else {
                            sifreliMetin += karakter;
                        }
                    }
                    System.out.println("Şifrelenmiş Metin: " + sifreliMetin + "\n");
                    
                } 
                
                else if (secim == 2) {
                    // Şifre Çözme
                    for(int i = 0; i < metin.length(); i++) {
                        char karakter = metin.charAt(i);
                        if (karakter != ' ') {
                            cozulenMetin += (char) (karakter - anahtar);
                        } 
                        else {
                            cozulenMetin += karakter;
                        }
                    }
                    System.out.println("Çözülmüş Metin: " + cozulenMetin + "\n");
                }
                
            } 
            
            else if (secim == 0) {
                System.out.println("Programdan çıkış yapıldı.");
            } 
            
            else {
                System.out.println("Geçersiz seçim! Lütfen 1, 2 veya 0'ı seçin.");
            }
        }
        scanner.close();
    }
}
