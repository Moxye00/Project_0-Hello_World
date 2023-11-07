public class Math {
    public static void main(String[] args) {
      System.out.println(Math.abs(-55));  //l'abs serve a rendere i valori neutri
      System.out.println(Math.min(55,12)); //il min serve a trovare il minimo
      System.out.println(Math.max(55,12)); //il max serve a trovare il massimo
      System.out.println(Math.pow(5, 4)); //il pow serve a trovare la potenza
      System.out.println(Math.sqrt(25)); //il sqrt serve a trovare la radice
      System.out.println(Math.PI); //il PI serve a calcolare il p greco

      double randomNum = Math.random(); //trova numeri random da 0 ad 1
      while(randomNum<0.5) {
        randomNum = Math.random();
      }
      System.out.println(randomNum);
    }
}