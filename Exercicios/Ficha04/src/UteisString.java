import java.util.Locale;

public class UteisString {
    private String input;
    int count =0;
    int countq =0;

    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }

    public int contarVogais(String input){
        String input1=input.toLowerCase();
        for(int i=0; i<input.length();i++){
            if (input1.charAt(i) == 'a'
                    || input1.charAt(i) == 'e'
                    || input1.charAt(i) == 'i'
                    || input1.charAt(i) == 'o'
                    || input1.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Número de vogais: " + count);
        return 0;
    }
    public int contarConsoantes(String input){
        String input1=input.toLowerCase();
        for(int i=0; i<input.length();i++){
            if (input1.charAt(i) != 'a'
                    && input1.charAt(i) != 'e'
                    && input1.charAt(i) != 'i'
                    && input1.charAt(i) != 'o'
                    && input1.charAt(i) != 'u') {
                countq++;
            }
        }
        System.out.println("Número de consuantes: " + countq);
        return 0;
    }
    public boolean ehPalidromo(String input){

        for(int i=0; i<input.length();i++){
            if(input.charAt(i)==input.charAt((input.length()-i-1))){
                continue;
            } else
                return false;
        }
        return true;
    }
    public int contarSubstring(String input) {
        int cont = 0;
        int index = 0;
        while ((index = input.indexOf(input, index)) != -1) {
            cont++;
            index += input.length();
        }
        System.out.println("Onúmero de substring é "+ cont);
        return cont;
}
}
