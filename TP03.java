package tp03;

/**
 *
 * @author henri
 */
public class TP03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hora h1 = new Hora();

        System.out.println("\n===== HORA 1 =====");

        System.out.println("Formato 24h: " + h1.getHora1());

        System.out.println("Formato 12h: " + h1.getHora2());

        System.out.println("Total de segundos: "
                + h1.getSegundos());

        Hora h2 = new Hora(13, 45, 20);

        System.out.println("\n===== HORA 2 =====");

        System.out.println("Formato 24h: " + h2.getHora1());

        System.out.println("Formato 12h: " + h2.getHora2());

        System.out.println("Total de segundos: "
                + h2.getSegundos());

        h2.setHor(22);
        h2.setMin(10);
        h2.setSeg(5);

        System.out.println("\n===== HORA 2 ALTERADA =====");

        System.out.println("Formato 24h: " + h2.getHora1());

        System.out.println("Formato 12h: " + h2.getHora2());

        System.out.println("Total de segundos: "
                + h2.getSegundos());
    }

}
