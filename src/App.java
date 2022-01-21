import model.Game;
import model.Word;
import util.Print;
import util.Read;
import util.Screen;

public class App {
    public static void main(String[] args) throws Exception {

        Word word = new Word("arthur");
        Game game = new Game(word);
        Print.titleAndDescription("Isso e um titulo bacana", "Nome | Matricula");
        int cont = 0;
        while (true) {
            Print.forca(cont, game.getGuessDisplay().toString());
            Character guess = Read.Char();
            game.updateGuessDisplay(guess);
            cont++;
        }
    }

}
