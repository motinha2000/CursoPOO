package aula05;

public class ContaBanco {
    // Atributos
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (this.tipo == "CC") {
            this.setSaldo(50f);
        } else if (t == "CP") {
            this.setSaldo(150f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com Dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!!!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("CONTA FECHADA!");
        }
    }

    public void sacar(float vlr) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= vlr) {
                setSaldo(getSaldo() - vlr);
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }

    }

    // Métodos especiais

    public void setNumConta(int num) {
        this.numconta = num;
    }

    public int getNumConta() {
        return this.numconta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void show(){
        System.out.println();
        System.out.println("NumConta: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("SALDO: " + this.saldo);
        System.out.println("status: " + this.status);
        System.out.println();
    }

    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }
}