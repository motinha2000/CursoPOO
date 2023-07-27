package aula12;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Onivoro");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE PEIXE");
    }

    public void soltarBolha(){
        System.out.println("GLUB..GLUB..GLUB");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
