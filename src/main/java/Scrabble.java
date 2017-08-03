import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Scrabble {


    public Integer calculateScore(String word) {
      List Score1 = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
      List Score2 = Arrays.asList("D", "G" );
      List Score3 = Arrays.asList("B", "C", "M","P" );
      List Score8 = Arrays.asList("J", "X" );
      List Score10 = Arrays.asList("Q", "Z" );
      List Score4 = Arrays.asList("F", "H", "V", "W", "Y");

      Integer totalScore = 0;
      String[] letter =word.split("");

      for (int i=0;i<letter.length ;i++ ) {
        String myCharacter = letter[i].toUpperCase();
        if (Score1.contains(myCharacter)) {
          totalScore+= 1;
        } else if (Score2.contains(myCharacter)) {
          totalScore+= 2;
        }else if (Score3.contains(myCharacter)) {
          totalScore+= 3;
        }else if (myCharacter.equals("K")) {
          totalScore+= 5;
        }else if (Score8.contains(myCharacter)) {
            totalScore+= 8;
        }else if (Score10.contains(myCharacter)) {
          totalScore+= 10;
        }else if (Score4.contains(myCharacter)) {
          totalScore+= 4;
        }else {
          return totalScore=0;
        }
      }
return totalScore;
    }

}
