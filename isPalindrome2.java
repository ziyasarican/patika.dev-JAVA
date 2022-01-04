public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome("abba"));
    }

    static boolean isPalindrome(String word){
        for (int i = 0; i < word.length(); i++) {
             if(word.charAt(i) != word.charAt(word.length()-1-i)){
                 return false;
             }
        }
        return true;
    }
}
