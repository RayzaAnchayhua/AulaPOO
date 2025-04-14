package lista.exercicio2;

public class Ponto4_2 {

        private String nome;
        private int X;
        private int Y;

        public Ponto4_2(String nome, int X, int Y) {
            this.nome = nome;
            this.X = X;
            this.Y = Y;
        }

        //Calculo da distância entre dois pontos
        public double calculoDistancia(Ponto4_2 a, Ponto4_2 b) {
            return  Math.sqrt(Math.pow((b.X - a.X), 2) + Math.pow((b.Y - a.Y), 2));
        }

        //Calculo do coeficiente ancular da reta(𝛼)
        public float calculoCoeficiente(Ponto4_2 a, Ponto4_2 b) {
            return  (float) (b.Y - a.Y) / (b.X - a.X); //cast - é a operação de atribuir o valor de uma var a outro tipo de var
        }

        //Double - 64 bits de precisão e apenas valores +
        //Float - 32 bits de preciso inclui valores de + e -

        //Autoria
        @Override
        public String toString() {
            System.out.println("---------------------");
            System.out.println("Feito por Rayza☻");
            System.out.println("---------------------");
            return "";
        }

    }
