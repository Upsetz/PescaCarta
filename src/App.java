import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.synth.SynthStyle;

public class App {
    public static void main(String[] args) throws Exception {
        

        Giocatore g1 = new Giocatore("Samuele");
        Giocatore g2 = new Giocatore("Andrea");
        Giocatore g3 = new Giocatore("Gabriele");

        System.out.println("------------Partita iniziata-----------");

        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        int c1 = g1.getCarta();
        int c2 = g2.getCarta();
        int c3 = g3.getCarta();

        if(c1 > c2){

            System.out.println("Ha vinto " + g1.getNome());
        }
        else if(c3 > c2){

            System.out.println("Ha vinto " + g3.getNome());
        }
        else{

            System.out.println("Ha vinto " + g2.getNome());
        }
        

    }
}
