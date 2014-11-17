
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    /**
     * This class handles writing to and from file.
     *
     * The methods are static so they can be called without making an object of
     * the class. If the application is designed with frequent file writing and
     * reading the a non-static method should be used instead.
     *
     *  EXAMPLE OF SAVING TO FILE:       
     *  ArrayList<String> as = new ArrayList<String>();
        as.add("Peter,3,8,12,13");
        as.add("Linda,18,2,4,5");
        as.add("Bob,8,12,4,6");
         
        FileHandlerStat.savePersons(as, "persons.txt");  
        
        EXAMPLE OF LOADING FROM FILE:
        ArrayList<String> outof = new ArrayList<String>();
        outof = FileHandlerStat.load("persons.txt");
        for (String line : outof) {
            System.out.println("Person: " + line);
        }   
     * 
     * @author Peter Lorensen
     */

public class FileHandler
{
    /**
     * The method loads strings from disk. The file resides in the project folder.
     *
     * Make sure to check for null before using the return value!
     *
     * @param filename String the name of the file (that is located in the project folder).
     * @return and ArrayList<String> were each String object is one line in the file.
     * If something goes wrong and an exception is raised this method will return null!
     */
        Scanner file_scanner;
        FileWriter output;  //Creating reference for filewriter.
        ArrayList<WordPair> tempPairs = new ArrayList();
        Random rand = new Random();
        
    public  ArrayList<WordPair> load(String filename)
    {

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while ( file_scanner.hasNextLine() ) {  //File found. Reading one line.     
            String str = file_scanner.nextLine();
            String[] tokens = str.split(", ");
            String danish = tokens[0].trim();
            String latvian = tokens[1].trim();
          
            WordPair pair = new WordPair(danish, latvian);
            tempPairs.add(pair);  //Reading in a single line and saving in the ArrayList
        System.out.println(pair.toFile());
        }
        file_scanner.close();  //Closing the file
        return tempPairs;   //return the arraylist.
        
    }
    public void save(String filename)
    {
        
        try {
                output = new FileWriter(new File(filename));  //Opening connection to file.
                for (WordPair pair : tempPairs) {   //running through the ArrayList.                    
                    output.append(pair.toFile()+ "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }
    
    public void add(String question, String answer){
        tempPairs.add(new WordPair(question, answer));
    
    }
    public int getSize(){ // gets size of arraylist
        return tempPairs.size();
    }
    public String getRandomQuestion(){
        return tempPairs.get(rand.nextInt(getSize())).getDanish();
    }
    public void clear(){ // clears an array list
        tempPairs.clear();
    }
    public boolean checkGuess(String question, String quess) {
    for (int i = 0; i < tempPairs.size(); i++) {
            if(tempPairs.get(i).getDanish().equalsIgnoreCase(question)){
                if(tempPairs.get(i).getLatvian().equalsIgnoreCase(quess)){
                    return true;
                }
            }
        }
        return false ;
    }
    public String lookup(String question) {
        for (int i = 0; i < tempPairs.size(); i++) {
            if(tempPairs.get(i).getDanish().equalsIgnoreCase(question)){
                return tempPairs.get(i).getLatvian();
            }
        }
        return null;
        
    }
    public String lookup2(String answer){
    for (int x = 0; x < tempPairs.size(); x++) {
            if(tempPairs.get(x).getLatvian().equalsIgnoreCase(answer)){
                return tempPairs.get (x).getDanish();
            }
        }
        return null;
    }
}
   
