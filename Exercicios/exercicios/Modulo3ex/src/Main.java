import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q = 0;
        String qwe = "";
        System.out.println("Hello and welcome!");

        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o nome do professor:");
        String cat= scan.nextLine();

        Scanner sd= new Scanner(System.in);
        System.out.println("Digite a idade do professor:");
        int qa= sd.nextInt();

        Scanner scan1= new Scanner(System.in);
        System.out.println("Qual o tipo do proofessor?");
        System.out.println("1-Parcial | 2-Integral | 3-Exclusivo");
        int cat1= scan1.nextInt();
        switch (cat1){
            case 1:
                qwe="Parcial";
                break;
            case 2:
                qwe="Integral";
                break;
            case 3:
                qwe="Exclusivo";
                break;
            default:
                System.out.println("Não");
                break;
        }

        Professor professor1 = new Professor(12);
        professor1.setNome(cat);
        professor1.setIdade(qa);
        professor1.setTipo(qwe);
        System.out.println(professor1.getNome());
        System.out.println(professor1.getIdade());
        System.out.println(professor1.getTipo());
    }
}