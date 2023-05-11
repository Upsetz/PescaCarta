public class Giocatore extends Thread{

    private String nome;
    private int carta;

    public Giocatore(String nome){

        this.nome = nome;
    }
    
    public void run(){

        System.out.println("Il giocatore " + nome + " sta giocando");

        this.carta = (int)(10*Math.random()) + 1;

        System.out.println("il giocatore: " + nome + " Ha pescato la carta " + carta + " " + this.getName());
    }


    public String getNome() {
        return nome;
    }




    public int getCarta() {
        return carta;
    }


}
