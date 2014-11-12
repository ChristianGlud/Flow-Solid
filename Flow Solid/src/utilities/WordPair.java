
package utilities;

public class WordPair {
    
    private String danish;
    private String latvian;
    
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
}
