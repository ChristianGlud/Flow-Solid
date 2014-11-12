
package controller;


import java.util.ArrayList;
import java.util.Hashtable;

public class Control implements WordPairControlInterface {

  private ArrayList<WordPair> pairs = new ArrayList<WordPair>();
    
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
        return null;
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        return false ;
    }

    @Override
    public String lookup(String question) {
        return null;
    }

    @Override
    public boolean load(String filename) {
        return false;
    }

    @Override
    public boolean save(String filename) {
        return false;
    }

    @Override
    public void clear() {

    }
    
}
