import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman("coding", "c");
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void newHangman_getCorrectAnswer_true() {
    Hangman testHangman = new Hangman("coding", "c");
    assertEquals("coding", testHangman.getAnswer());
  }

  @Test
  public void newHangman_getLetterFromUser_true() {
    Hangman testHangman = new Hangman("coding", "c");
    assertEquals("c", testHangman.getUserInput());
  }

  @Test
  public void newHangman_compareLetterToAnswer_true() {
    Hangman testHangman = new Hangman("coding", "c");
    assertEquals(true, testHangman.goodInput());
  }
}
