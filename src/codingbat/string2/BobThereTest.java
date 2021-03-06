package codingbat.string2;

/*
 * Return true if the given string contains a "bob" string, 
 * but where the middle 'o' char can be any char. 
 * 
 * bobThere("abcbob") = true
 * bobThere("b9b") = true
 * bobThere("bac") = false
 * 
 */

public class BobThereTest {

  public static void main(String[] args) {

    BobThereTest test = new BobThereTest();

    System.out.println(">" + test.bobThere("abcbob") + "<");
    System.out.println(">" + test.bobThere("b9b") + "<");
    System.out.println(">" + test.bobThere("bac") + "<");
  }

  public boolean bobThere(String str) {
    String test;

    for (int i = 0; i < str.length()-2; i++) {
      test = str.substring(i, i+3);
      
      if(test.matches("b.b")) {
        return true;
      }
    }

    return false;
  }

}
