package aula08;

import java.util.Random;

public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    // MÉTODOS SET E GET

    

    // MÉTODOS ESPECIAIS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCat().equals(l1.getCat()) && l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
            if(this.aprovada && !(desafiado.getCat().equals(desafiante.getCat()))){
                System.out.println("### DESAFIADO ###");
                this.desafiado.apresentar();
                System.out.println("### DESAFIANTE ###");
                this.desafiante.apresentar();

                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                switch(vencedor){
                    case 0:
                        System.out.println("Empatou!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Venceu " + this.desafiado.getName());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Venceu " + this.desafiante.getName());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
                }
            } else {
                System.out.println("A luta não pode acontecer!");
            }
    }

}
