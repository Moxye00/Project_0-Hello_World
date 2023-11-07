public class ArrayYt {
    public static void main(String[] args) {

//cosa sono gli Array?
//sono collezioni di dati correlati tra di loro

        //int[] numeri = new int [3];
        int[] numeri = {10, 20, 30, 40};
        //numeri[0] = 10;
        //numeri[1] = 20;
        //numeri[2] = 30;
        //System.out.println(numeri.length);
        //System.out.println(numeri[1]);
        //numeri[1] = 100;
        //System.out.println(numeri[1]);
        //System.out.println(numeri.length);
        //System.out.println(numeri[numeri.length - 1]);
        //for(int i = 0; i < numeri.length; i++) {
            //System.out.println(numeri[i]);
        for(int numero : numeri) {
            System.out.println(numero);
        }
    }
}