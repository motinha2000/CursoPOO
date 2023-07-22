package aula08;

public class Main {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("TONHO-COUVE-FLOR", "Georgia", 45, 1.70f, 71f, 10, 3, 2);
        

        l[1] = new Lutador("ZÉ BOM DE PERNA", "Noruega", 32, 1.90f, 95f, 14, 1, 2);
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[0]);
        UEC01.lutar();

        l[0].status();
        l[1].status();
    }
}
