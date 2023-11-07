import java.util.Scanner; 
public class Home {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual'è il tuo nome?");
        String nome = scanner.nextLine();
        System.out.println("Ciao " + nome);
 
        System.out.println("Da dove vieni?");
        String citta = scanner.nextLine();
        System.out.println("Wow... " + citta + " " + "è una bellissima città!");

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Non l'avrei mai detto, te li porti bene");

        
             }
            }
            