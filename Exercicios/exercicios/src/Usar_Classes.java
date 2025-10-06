public class Usar_Classes {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Carro carro1 = new Carro();
        carro1.setMarca("Ferrari");
        carro1.setAno(2024);
        carro1.acelerar();
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getVelocidade());
    }
}

