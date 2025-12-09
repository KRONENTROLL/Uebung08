package p2;

import java.util.Locale;

public class P2_main {
  public static void main(String[] args) {
      int shortenBy = 13;
      String input = new String("RindfLeischetikETTierung");
      System.out.println(shortenToLowerCase(input, shortenBy));
  }
      static public String shortenToLowerCase (String input, int shortenBy) {
          if (shortenBy == 0) return "";
          if (shortenBy >= input.length()) return "";
          return input.substring(0, input.length() - shortenBy).toLowerCase(Locale.ROOT);
      }
}