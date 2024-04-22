public class Aula3 {

     String nome;
     int idade;

     public String votar() {
         if (idade >= 18) {
             return "Apto";
         } else{
             return "Nao apto";
         }

     }

    public static void main(String[] args) {

        // Criando objetos

        Aula3 a = new Aula3();
        Aula3 a1 = new Aula3();
        a.nome= "Jefferson";
        a.idade = 20;
        a.votar();

        a1.nome = "Pedro";
        a1.idade = 16;
        a1.votar();

        System.out.println("Nome: " + a.nome);
        System.out.println("Idade: " + a.idade);
        System.out.println("Vota: "  + a.votar());
        System.out.println("\n");
        System.out.println(a1.nome);
        System.out.println(a1.idade);
        System.out.println(a1.votar());

    }
}
