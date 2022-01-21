package util;

public class Print {

    /**
     * Construtor privado para Classe Util
     */
    private Print() {

    }

    /**
     * Imprime espaços ate que a palavra esteja ao centro.
     * 
     * @param tamTexto,tamDivisor
     */
    private static void spaces(int tamTexto, int tamDivisor) {

        int quantEspacos, i;
        quantEspacos = (tamDivisor - tamTexto) / 2;

        for (i = 0; i < quantEspacos; i++) {
            System.out.printf(" ");
        }

    }

    /**
     * Cria uma linha e "-" no terminal.
     */
    public static void split() {
        System.out.printf("\n------------------------------------------------------------\n");
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param title
     */
    public static void title(String title) {
        Print.split();
        Print.spaces(title.length(), 60);
        System.out.print(title);
        Print.split();
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param title,description
     */
    public static void titleAndDescription(String title, String description) {
        Print.split();
        Print.spaces(title.length(), 60);
        System.out.println(title);

        Print.spaces(description.length(), 60);
        System.out.print(description);
        Print.split();
    }

    /**
     * Imprime o menu.
     */
    public static void menu() {
        System.out.println("1. Gerenciar Temas");
        System.out.println("2. Gerenciar Palavras");
        System.out.println("3. Jogar");
        System.out.println("4. Sair");
    }

    public static void forca(int stage, String guess) {

        switch (stage) {
            case 0: // No error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |             ");
                System.out.println("  |             ");
                System.out.println("  |             ");
                System.out.println("__|__           " + guess);

                break;
            case 1: // 1 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   ('-')     ");
                System.out.println("  |             ");
                System.out.println("  |             " + guess);
                System.out.println("__|__           ");

                break;

            case 2: // 2 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   ('-')     ");
                System.out.println("  |    /        ");
                System.out.println("  |             " + guess);
                System.out.println("__|__           ");

                break;
            case 3: // 3 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   ('-')     ");
                System.out.println("  |    /|       ");
                System.out.println("  |             " + guess);
                System.out.println("__|__           ");

                break;
            case 4: // 4 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   (-_-)     ");
                System.out.println("  |    /|\\     ");
                System.out.println("  |             " + guess);
                System.out.println("__|__           ");

                break;
            case 5: // 5 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   (-_-)     ");
                System.out.println("  |    /|\\     ");
                System.out.println("  |    /        " + guess);
                System.out.println("__|__           ");

                break;
            case 6: // 6 error
                System.out.println("   _____        ");
                System.out.println("  |     |       ");
                System.out.println("  |   (x_x)     ");
                System.out.println("  |    /|\\     ");
                System.out.println("  |    / \\     " + guess);
                System.out.println("__|__           ");

                break;

        }

    }
}
