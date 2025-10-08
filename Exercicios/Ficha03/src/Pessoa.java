public class Pessoa{
    private String nome;
    private char genero;
    private int idade;


    public Pessoa() { }
    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
    }
    public Pessoa(String n, char g, int i){
        this(n,g); // usa o construtor anterior
        this.idade = i; }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public Character getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    static void falar() {
        System.out.println("Blá,blá,blá,blá,...");
    }
}
