package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    

    @Override
    public String toString() {
        return "\nGafanhoto [login="+ super.toString() + login + ", totAssistido=" + totAssistido + "]";
    }



    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssustido() {
        return totAssistido;
    }
    public void setTotAssustido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
}
