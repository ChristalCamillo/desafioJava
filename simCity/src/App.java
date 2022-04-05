import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        nomeEprofissao();
}

public static  String nomeEprofissao(){
    Scanner leitor = new Scanner(System.in);
        String listaDeNomes[];
        String listaDeProfissoes[];

        for (int i = 0; i < listaDeNomes.length; i++) {
            System.out.println("Nome: ");
            String nome = leitor.nextLine();
            listaDeNomes[i] = nome;
        }

        for (int i = 0; i < listaDeProfissoes.length; i++) {
            System.out.println("Profissão: ");
            String profissao = leitor.nextLine();
            listaDeProfissoes[i] = profissao;
        }

        for(int c = 0; c < listaDeNomes.length; c++) && (int i = 0; i < listaDeProfissoes.length; i++) {
            System.out.println(listaDeNomes[i]+listaDeProfissoes[i]);
        }
}
}
