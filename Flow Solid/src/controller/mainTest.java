
package controller;

/**
 *
 * @author Rihards
 */
public class mainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileHandler fh = new FileHandler();
        fh.load("words.txt");
        System.out.println(fh.load("words.txt"));
        
    }
    
}
