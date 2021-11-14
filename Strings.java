public class Strings {

  public static void main(String[] args) {
    // String name = new String("Zuhaib");
    // Strings are immutable and can not be changed
    String name = "Zuhaib";
    // System.out.println(name);
    int a = 10;
    float b = 10.1231F;
    char c = 'I';
    // printf works the same as it did in C
    // There is also System.out.format() which works in the same way
    System.out.printf(
      "The value of a is %d and the value of b is %f and the value of c is %c",
      a,
      b,
      c
    );

    // System.out.println(name);
    // int value = name.length();
    // System.out.println(value);

    // String lstring = name.toLowerCase();
    // System.out.println(lstring);

    // String ustring = name.toUpperCase();
    // System.out.println(ustring);

    // String nonTrimmedString = "     Zuhaib     ";
    // System.out.println(nonTrimmedString);

    // String trimmedString = nonTrimmedString.trim();
    // System.out.println(trimmedString);

    // System.out.println(name.substring(1));
    // System.out.println(name.substring(1,5));

    // System.out.println(name.replace('b', 'I'));
    // System.out.println(name.replace("b", "beebbebbeebe"));

    // System.out.println(name.startsWith("Zu"));
    // System.out.println(name.endsWith("dd"));

    // System.out.println(name.charAt(4));

    // String modifiedName = "Zuhhaihhaib";
    // System.out.println(modifiedName.indexOf("hh"));
    // System.out.println(modifiedName.indexOf("hh", 4));
    // System.out.println(modifiedName.lastIndexOf("hha", 7));

    // System.out.println(name.equals("Zuhaib"));
    System.out.println(name.equalsIgnoreCase("ZuHAiB"));

    System.out.println("I am escape sequence\tdouble quote");
  }
}
