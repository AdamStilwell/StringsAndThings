package io.zipcoder;


import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        //split the string into separate words
        //check what the last letter of each word is (not case sensitive)
        //compare unknown letter to known letter
        //count addition based on matching letter
        String stringY  = "y";
        String stringZ  = "z";
        int actual = 0;
        String separatedWordsArray[] = input.split(" ");
        int l = separatedWordsArray.length;
        for (int i = 0; i < l; i++) {
            String separatedWord = separatedWordsArray[i].toString();
            int pos = separatedWord.length()-1;
            String lastLetter = String.valueOf(separatedWord.charAt(pos));
            if (stringY.equalsIgnoreCase(lastLetter)){
                actual++;
            }else if (stringZ.equalsIgnoreCase(lastLetter)) {
                actual++;
            }
        }

        return actual;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
            String newWord = base.replaceAll(remove, "");
            return newWord;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCount = 0;
        int notCount = 0;
        if(input.contains("is")){
           isCount ++;
        }
        if(input.contains("not")){
            notCount++;
        }
        if (isCount==notCount){
            return true;
        }else {
            return false;
        }

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        if(input.contains("gg")) {
            return true;
        }else {
            return false;
        }

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int l = input.length()-2;
        int count = 0;
        for (int i = 0; i < l; i++) {
                if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i + 1) == input.charAt(i + 2)) {
                    count++;
                }
            }
        return count;
    }
}
