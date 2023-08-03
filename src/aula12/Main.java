package aula12;

public class Main {
    public static void main(String[] args) {
        Cachorro lulu = new Cachorro();
        Canguru scooby = new Canguru();


        lulu.setRaca("Pitbull");
        System.out.println(lulu.getRaca());
        lulu.locomover();
        scooby.locomover();
        scooby.emitirSom();
    
    }

}