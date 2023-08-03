package aula12;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected String membros;

    public abstract void locomover();// PARECIDO COM O Arquivo .h em C!
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getMembros() {
        return membros;
    }
    public void setMembros(String membros) {
        this.membros = membros;
    }

    
}
