package miniprojeasalsayi;

public class Main {
  /* verilen sayı asalmı değilmi kontrol eden uygulama 
   */
  public static void main(String[] args) {
    int number = -2;
    boolean asalMı = true; //baştan asal dedik. bölünürse değil diyeceğiz. 
    
    if(number==1) {
    	System.out.println("Sayı asal değildir.");
    	return;
    }
    
    if(number<1) {
    	System.out.println("Geçersiz sayı girdiniz.");
         return;      
    }
    
     
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {

        asalMı = false;

      }

    }
    if (asalMı==true) {
      System.out.println("Sayı asaldır.");
    } else {
      System.out.println("Sayı asal değildir");
    }

  }

}