import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        String[] usuario = new String[2];
        double salarios[] = new double[12];

        Scanner leitor = new Scanner(System.in);

        int iteração = 100;

    do{
        System.out.println("Bem vinde ao sistema de impostos de SimCity");
        System.out.println("------Escolha a opção de acordo com o que deseja acessar-----");
        System.out.println("1 - Cadastre seu nome e profissão");
        System.out.println("2 - Cadastre seu salário dos últimos 12 meses");
        System.out.println("3 - Acesse o imposto mensal devido");
        System.out.println("4 - Acesse informações cadastradas de nome e profissão");
        System.out.println("5 - Sair do programa");

        int opcao = leitor.nextInt();

        if (opcao == 1){
            System.out.println("Insira o seu nome: ");
            usuario[0] = leitor.next();
            System.out.println("Insira a sua profissão: ");
            usuario[1] = leitor.next();
            
        } else if (opcao == 2){
            System.out.println(infosUsuario(usuario));

        } else if(opcao == 3){
            for(int i=0; i < salarios.length; i++){
                System.out.println("Insira o valor de salário recebido no mês "+(i+1)+"º: ");
                salarios[i] = leitor.nextDouble();
            }
            System.out.println("Salários cadastrados");

        } else if (opcao == 4){
            for(int i=0; i < salarios.length; i++){
                System.out.println("No "+(i+1)+"º mês o valor devido é de R$: ");

                if(salarios[i] <= 2000.00){
                    System.out.println("Isento do pagamento de imposto.");

                } else if (salarios[i] >= 2001.00 & salarios[i] <= 3000.00){
                    double imposto = salarios[i] * 8/100;
                    System.out.println(imposto);
                    
                } else if (salarios[i] >= 3001.00 & salarios[i] <= 4500.00){
                    double imposto = salarios[i] * 18/100;
                    System.out.println(imposto);

                } else if (salarios[i] > 4500.00){
                    double imposto = salarios[i] * 28/100;
                    System.out.println(imposto);

                } else {
                    System.out.println("Informação inválida");
                }
            }

        } else if(opcao == 5){
            sairPrograma();

        } else {
            System.out.println("Erro, digite um número válido");
        }
    }while(iteração <= 100);

        }

private static String infosUsuario(String[] usuario) {
    String cadastro = "Nome cadastrado: "+usuario[0]+"\nProfissão cadastrada: "+usuario[1];
    return cadastro;
}

private static void sairPrograma(){
    System.exit(0);
}
}