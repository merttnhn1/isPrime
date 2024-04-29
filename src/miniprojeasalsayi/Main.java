package miniprojeasalsayi;

public class Main {
  /* verilen sayı asalmı değilmi kontrol eden uygulama 
   */
  public static void main(String[] args) {
    int number = 13;
    boolean asalMı = true; //baştan asal dedik. bölünürse değil diyeceğiz. 
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {

        asalMı = false;

      }

    }
    if (asalMı) {
      System.out.println("Sayı asaldır.");
    } else {
      System.out.println("Sayı asal değildir");
    }

  }

}