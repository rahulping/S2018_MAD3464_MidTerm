
public class MaxOccurenceOfCharacter {
    
        public static String find(String input) {
        char[] array = input.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
 
          for(int i = 0, j = 0; i < input.length() - 1; i = j){
               int count = 1;
           while (++j < input.length() && array[i] == array[j]) {
                  count++;
                }
         
          if (count >= maxCount) {
             maxCount = count;
             maxChar = array[i];
         }
         
        }
 
    return (maxChar + " = " + maxCount);
    }
}

    
    
    

