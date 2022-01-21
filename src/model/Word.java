package model;

import java.util.ArrayList;

public class Word {
    private Theme theme;
    private String word;
    private int len;
    private ArrayList<String> blank;

    public Word(String word) {
        this.word = word;
        this.len = word.length();

        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i < this.len; i++) {
            tmp.add("_ ");
        }
        this.blank = tmp;
    }

    public Word(Theme theme, String word) {
        this.theme = theme;
        this.word = word;
        this.len = word.length();

        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i < this.len; i++) {
            tmp.add("_ ");
        }
        this.blank = tmp;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public ArrayList<String> getBlank() {
        return blank;
    }

    public void setBlank(ArrayList<String> blank) {
        this.blank = blank;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
