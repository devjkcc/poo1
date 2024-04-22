import java.util.Scanner;

    public class Aula1 {
        public static void main(String[] args) {

        // Exercicio viagem
            Scanner sc = new Scanner(System.in);
            double tempo, velocidade;


            System.out.println("Digite o tempo gasto(em horas)");
            tempo = Double.parseDouble(sc.nextLine());
            System.out.println("Digite a velocidade média");
            velocidade = Double.parseDouble(sc.nextLine());

            double distancia = (tempo * velocidade);

             double litrosUsados = (distancia/12);

             String stringNumeroFormatado= String.format("%.2f", litrosUsados);

            System.out.println("Seu gasto foi de " + stringNumeroFormatado + " Litros");


        }
    }
