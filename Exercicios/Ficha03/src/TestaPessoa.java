import java.util.Scanner;

public class TestaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não
    // for explicitamente declarado
    public TestaPessoa() {
    }

    public static void main(String[] args) {
        //Declara objeto pessoa1
        Pessoa pessoa1;
        //Cria o objeto pessoa1 que é instância da classe Pessoa
        pessoa1 = new Pessoa();

        //Define os valores para os atributos de pessoa1
        Scanner as = new Scanner(System.in);
        System.out.println("Qual é o nome da pessoa?");
        String zx=as.nextLine();

        System.out.println("Qual o genero da pessoa?");
        char zxcv=as.next().charAt(0);

        System.out.println("Qual é a idade dessa pessoa?");
        int zxc=as.nextInt();


        pessoa1.setNome(zx);
        pessoa1.setGenero(zxcv);
        pessoa1.setIdade(zxc);
        System.out.println(
                "O objeto pessoa1 chama-se " + pessoa1.getNome() +
                        ", é do sexo " + pessoa1.getGenero() +
                        ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
    }
}
