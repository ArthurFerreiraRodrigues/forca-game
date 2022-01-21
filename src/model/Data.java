package model;

import java.util.ArrayList;

public class Data {
    private final ArrayList<Theme> themes = new ArrayList<>();
    private final ArrayList<Word> words = new ArrayList<>();

    /**
     * Construtor privado para Classe de Dados
     */
    private Data() {

    }

    public ArrayList<Theme> getThemes() {
        return themes;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

}
