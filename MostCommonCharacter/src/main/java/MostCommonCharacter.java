import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char common = ' ';
        char[] cArr = str.toCharArray();
        HashMap<Character, Integer> hmChar = new HashMap<>();

        for(char a : cArr){
            //add number of times character appears
            if(hmChar.containsKey(a)){
                Integer occurence = hmChar.get(a);
                hmChar.replace(a, occurence, occurence+1);
            }
            //new character is put in 
            else{
                hmChar.put(a, 1);
            }
        }

        //loop through hashmap to see the most amount appearance of a character
        Integer most = 0;
        for(char c : hmChar.keySet()){
            if(hmChar.get(c) > most){
                most = hmChar.get(c);
                common = c;
            }
        }
        return common;
    }
}
