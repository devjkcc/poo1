public class CalcadoApplication {
    public static void main(String[] args) {
        Calcado c = new Calcado();
        Chinelo ch = new Chinelo();
        Tenis t = new Tenis();
        Sapato s = new Sapato();

        ch.entrada();
        ch.imprimir();
        System.out.println("\n");
        t.entrada();
        t.imprimir();
        System.out.println("\n");
        s.entrada();
        s.imprimir();

    }

}
