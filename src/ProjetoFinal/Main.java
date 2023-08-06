package ProjetoFinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de POO");
        v[2] = new Video("Aula final de POO");
        //System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Yuumi", 22, "M", "yum");
        //System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(85.0f);
        System.out.println(vis[0].toString());
        System.out.println("\n"+vis[1].toString());

    }
}
