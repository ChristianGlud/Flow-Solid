
package controller;


import java.util.Hashtable;

public class Control implements WordPairControlInterface {

   ArrayList<WordPair> pairs = new ArrayList<WordPair>();
    
    //WordStoring pairs = new WordStoring();
    //pairs.add();
    @Override
    public void add(String question, String answer) {
    pairs.add(new WordPair(question, answer));
    }

    @Override
    public int size() {
       return pairs.size();
    }

    @Override
    public String getRandomQuestion() {

    }

    @Override
    public boolean checkGuess(String question, String quess) {

    }

    @Override
    public String lookup(String question) {

    }

    @Override
    public boolean load(String filename) {

    }

    @Override
    public boolean save(String filename) {

    }

    @Override
    public void clear() {

    }
    
}
