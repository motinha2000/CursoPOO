package aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p4.setSexo("Feminino");

        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p2.cancelarMatr();
        p3.ReceberAum();
        p4.mudarTrabalho();

        //FILHOS PODEM FAZER AS COISAS QUE A MÂE FAZ, MAS O INVERSO NÂO ACONTECE
        p1.fazerAniv();
        p2.fazerAniv();
        p3.fazerAniv();
        p4.fazerAniv();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}