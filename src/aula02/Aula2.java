package aula02;

public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Fine Pen";
        c1.cor = "Azul";
        c1.ponta = 0.4f;
        c1.carga = 95;

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Trilux";
        c2.cor = "Preta";
        c2.ponta = 0.8f;
        c2.carga = 50;

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
