
package controller;

public class WordPair {
    
    public String danish;
    public String latvian;
    
    public WordPair (String dan, String lat){  //constructs object of this class
    
        this.danish = dan;
        this.latvian = lat;
    }

    public String getDanish() {
        return danish;
    }

    public String getLatvian() {
        return latvian;
    }   
    
    public String toFile() {
        
        String wordPair = danish + ", " + latvian;
        return wordPair;
    
    }
}
