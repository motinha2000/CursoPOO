package aula13;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Vai apanhar");
        c.reagir("Olá");

        c.reagir(11,45);
        c.reagir(19,00);
        
        c.reagir(true);
        c.reagir(false);

        c.reagir(19, 22.5f);
        c.reagir(4, 9f);
    }
}
