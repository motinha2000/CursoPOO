package aula12;

public final class Cachorro extends Mamifero {
    private String raca;

    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
