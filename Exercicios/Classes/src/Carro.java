
    public class Carro{
            private String marca;
            private int ano;
            private int velocidade;

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void acelerar(){
                this.velocidade +=50;
            }
            public void travar(){
                this.velocidade /=2;
            }

        public int getVelocidade() {
            return velocidade;
        }

    }

