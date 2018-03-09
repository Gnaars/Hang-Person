/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Fedor
 */
import java.util.ArrayList;
import java.util.Arrays;
public class HangPerson {

    ArrayList<String> words = new ArrayList<String>();
    public int wlc;
    
    public String randoWord(){
        //For some reason my code has a preference to select "Jerry Seinfeld" more often than any other word/phrase... this bug is beyond my scope of knowledge.
        words.addAll(Arrays.asList("heel","bag","body","banish","drift","jerry seinfeld","background","ursadak","sandwich","paradox","gravity","relativity","physics","bento","capricorn","paul","jerry seinfeld","jerry seinfeld","jerry seinfeld","jerry seinfeld","jerry seinfeld"));
            String ranWord = words.get((int)(Math.random()*words.size()));
                return(ranWord);
            }
   /* public int wrongLetterCount(){
            wlc = wlc=+1;
                return(wlc);
            }*/
}