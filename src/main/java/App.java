
import java.io.Console;
public class App{
  public static void main(String[] args){
    Console console= System.console();

    boolean programRunning=true;
    while(programRunning){
    System.out.println("Enter the word or type 123 toExit");

  String myWord = console.readLine();
  Scrabble inputedWord =new Scrabble();
  Integer total = inputedWord.calculateScore(myWord);



  if (total >0) {
    System.out.println("The score for "+myWord+" is "+total);
  }else if (myWord.equals("123")) {
    programRunning=false;
  }else {
    System.out.println("This is not a word");
  }
 }
}
}
