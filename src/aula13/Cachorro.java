package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!\n");
    }

    public void reagir(String frase) {
        if(frase.equals("Toma comida\n") || frase.equals("Olá") || frase.equals("cheguei")){
            System.out.println("Abanar e latir!\n");
        } else {
            System.out.println("Rosnar\n");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12){
            System.out.println("Abanar\n");
        } else if (hora >= 18) {
            System.out.println("Ignorar\n");
        } else {
            System.out.println("Abanar e Latir!\n");
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanar\n");
        } else {
            System.out.println("Rosnar e Latir!\n");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso<10) {
                System.out.println("Abanar\n");
            } else {
                System.out.println("Latir!\n");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar\n");
            } else {
                System.out.println("Ignorar\n");
            }
        }
    }
}
