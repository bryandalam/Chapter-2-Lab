
public class Palindrome
{
 public String word;
 public String nextWord;
 public boolean isPalindrome;
 public Palindrome(String wd)
 {
     this.word = wd;
 }
 public boolean testWord() {
    for(int i = 0; i < word.length(); i++) {
        System.out.println(word.substring(i, i+1));
    }
    if (word == nextWord) {
        isPalindrome = true;
    }
     
     
     
     
    return isPalindrome;
 }
}
