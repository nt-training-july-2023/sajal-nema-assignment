@FunctionalInterface
interface I1{
    public abstract String containsVowel(String s);
}
public class ReplaceVowel{
    public static void main(String[] args) {
        I1 ref = (String s) -> {
            char ch[] = {'a','e','i','o','u'};
            for(char val : ch){
              s = s.replace(val, '#');
            }
            return s;
        };
        System.out.println("The String after replacing vowel is " + ref.containsVowel("Sajalaeiou"));
     }
}