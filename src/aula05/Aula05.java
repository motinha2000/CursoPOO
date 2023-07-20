package aula05;

public class Aula05 {
    public static void main (String[] args){
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CP");
        c1.setDono("Gabriel");
        c1.setNumConta(147258);
        c1.show();
        
        c1.sacar(100f);
        c1.depositar(450f);
        c1.sacar(2000f);
        c1.show();
    }
}
