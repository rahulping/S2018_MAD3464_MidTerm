
public class NameIntials {
        public static String initials(String input) {
        String[] words = input.split("\\s+");
        String output = "";
        int numberOfWords = words.length;
        if(numberOfWords < 3) {
            return null;
        }
        
        for(int i=1; i <= numberOfWords; i++) {
             String word = words[i-1];
            if(i != numberOfWords) {
                char c = word.toUpperCase().charAt(0);
                output = output + c + ". ";
            } else {
                word = word.toLowerCase();
                //word = word.charAt(0).toUppercase();
                String newWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                output = output + newWord;
            }
        }
        
        return output;
    }
}

    
    
    

