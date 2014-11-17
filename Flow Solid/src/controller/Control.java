
package controller;


import java.util.ArrayList;
import java.util.Random;

public class Control implements WordPairControlInterface {

  //private ArrayList<WordPair> pairs = new ArrayList();
  private Random rand;
  FileHandler fh = new FileHandler();
  
    public Control(){   //constructor
    //this.pairs = new ArrayList();
    this.rand = new Random();
    }
    
    @Override
    public void add(String question, String answer) {
        fh.add(question, answer);
    }

    @Override
    public int size() {
      return fh.getSize();
    }

    @Override
    public String getRandomQuestion() {  
        return fh.getRandomQuestion();
    }  
    
    @Override
    public boolean checkGuess(String question, String quess) {
        return fh.checkGuess(question, quess);
    }

    @Override
    public String lookup(String question) {
        return fh.lookup(question);
    }

    @Override
    public boolean load(String filename) {
       try{ 
           fh.load(filename);
       }catch (Exception e){
           return false;
       }
       return true;
    }

    @Override
    public boolean save(String filename) {
        try {
            fh.save(filename);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void clear() {
        fh.clear();
    }
    
}
