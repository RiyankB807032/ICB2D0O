class Scoping {
  public static void main(String [] args) {
    {
    String s = "this set of brackets defines a scope";
    
    System.out.println(s);
    }
  } // closes main function
} // closes class scope
