package lista.exercicio2;

public class Ponto4_2 {

        private String nome;
        private float X;
        private float Y;

        public Ponto4_2(String nome, float X, float Y) {
            this.nome = nome;
            this.X = X;
            this.Y = Y;
        }

        //Calculo da distância entre dois pontos
        public float calculoDistancia(Ponto4_2 a, Ponto4_2 b) {
            return (float) Math.sqrt(Math.pow((b.X - a.X), 2) + Math.pow((b.Y - a.Y), 2));
        }

        //Calculo do coeficiente ancular da reta(𝛼)
        public float calculoCoeficiente(Ponto4_2 a, Ponto4_2 b) {
            return  (b.Y - a.Y) / (b.X - a.X);
        }

        //Autoria
        @Override
        public String toString() {
            System.out.println("---------------------");
            System.out.println("Feito por Rayza☻");
            System.out.println("---------------------");
            return "";
        }

    }
