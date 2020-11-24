public class Tester {

   public static void main(String[] args) {
      MasterMind m1 = new MasterMind(); // test default constructor
      String check1 = m1.check("****"); // expected ""
      MasterMind m2 = new MasterMind("R", 5); // test custom constructor
      String check2a = m2.check("RRRRR"); // expected "+++++"
      String check2b = m2.check("ABCDE"); // expected ""
      String check2c = m2.check("ARARA"); // expected "++"
   }
}