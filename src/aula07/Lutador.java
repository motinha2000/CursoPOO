package aula07;

public class Lutador implements Controlador {
    // ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // CONSTRUTOR
    public Lutador(String n, String nac, int i, float a, float p, int v, int d, int e) {
        this.setName(n);
        this.setNac(nac);
        this.setIdade(i);
        this.setAlt(a);
        this.setPeso(p);
        this.setVit(v);
        this.setDer(d);
        this.setEmp(e);
    }

    // GET E SET
    private void setName(String n) {
        this.nome = n;
    }

    private String getName() {
        return this.nome;
    }

    private void setNac(String nac) {
        this.nacionalidade = nac;
    }

    private String getNac() {
        return this.nacionalidade;
    }

    private void setIdade(int i) {
        this.idade = i;
    }

    private int getIdade() {
        return this.idade;
    }

    private void setAlt(float a) {
        this.altura = a;
    }

    private float getAlt() {
        return this.altura;
    }

    private void setPeso(float p) {
        this.peso = p;
        this.setCat();
    }

    private float getPeso() {
        return this.peso;
    }

    private void setCat() {
        if (this.getPeso() < 52.5f) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    private String getCat() {
        return this.categoria;
    }

    private void setVit(int v) {
        this.vitorias = v;
    }

    private int getVit() {
        return this.vitorias;
    }

    private void setDer(int d) {
        this.derrotas = d;
    }

    private int getDer() {
        return this.derrotas;
    }

    private void setEmp(int e) {
        this.empates = e;
    }

    private int getEmp() {
        return this.empates;
    }

    // MÉTODOS ABSTRATOS
    @Override
    public void apresentar() {
        System.out.println("------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getName());
        System.out.println("Diretamente d(a/e/o) " + this.getNac());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAlt() + "mts");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVit() + " vitórias");
        System.out.println(this.getDer() + " derrotas e");
        System.out.println(this.getEmp() + " empates!");
    }

    @Override
    public void status() {
        System.out.println("------------------------------");
        System.out.println(this.getName() + " é um peso " + this.getCat());
        System.out.println("Ganhou " + this.getVit() + " vezes");
        System.out.println("Perdeu " + this.getDer() + " vezes");
        System.out.println("Empatou " + this.getEmp() + " vezes");
    }

    @Override
    public void ganharLuta() {
        this.setVit(this.getVit() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDer(this.getDer() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmp(this.getDer() + 1);
    }

}
