package aula12;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE AVE");
    }

    public void fazerNinho() {
        System.out.println("Fez um Ninho!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
