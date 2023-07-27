package aula12;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comer");
    }
    @Override
    public void emitirSom(){
        System.out.println("SOM DE REPTIL");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
