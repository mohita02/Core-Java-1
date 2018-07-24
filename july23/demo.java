import java.util.Scanner;

public class demo{
    public static int count(String word) {
        if (word == null || word.isEmpty()) {
          return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = word.length() - 1;
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
          if (Character.isLetter(characters[i]) && i != endOfLine) {
            isWord = true;
          } else if (!Character.isLetter(characters[i]) && isWord) {
            wordCount++;
            isWord = false;
          } else if (Character.isLetter(characters[i]) && i == endOfLine) {
            wordCount++;
          }
        }
        return wordCount;
      }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = count(s);
        System.out.println("No of Words : " + n);
        sc.close();
    }
}