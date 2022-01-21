package model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private ArrayList<String> guessDisplay;
    private Word gameWord;

    public Game(Word gameWord) {
        this.gameWord = gameWord;
        guessDisplay = gameWord.getBlank();
    }

    public void updateGuessDisplay(Character guess) {
        if (gameWord.getWord().contains(guess.toString())) {
            this.setGuessDisplay(this.getMatchesIndexes(gameWord, guess), guess);
        }
    }

    private Integer[] getMatchesIndexes(Word gameWord, Character guess) {
        if (!gameWord.getWord().contains(guess.toString())) {
            return null;
        }
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < gameWord.getLen(); i++) {
            if (guess.equals(gameWord.getWord().charAt(i))) {
                indexes.add(i);
            }
        }
        return indexes.toArray(new Integer[indexes.size()]);

    }

    public ArrayList<String> getGuessDisplay() {
        return guessDisplay;
    }

    public void setGuessDisplay(Integer[] indexes, Character guess) {
        Character[] displayArray = this.guessDisplay.toArray(new Character[this.guessDisplay.size()]);
        ArrayList<String> tmp = new ArrayList<>();
        for (int i = 0; i < indexes.length; i++) {
            displayArray[indexes[i]] = Character.toUpperCase(guess);
            tmp.add(displayArray.toString());
        }

        this.guessDisplay = tmp;
    }

    public Word getGameWord() {
        return gameWord;
    }

    public void setGameWord(Word gameWord) {
        this.gameWord = gameWord;
    }

}
