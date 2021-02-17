public class SolutionTester {

   public static void main(String[] args) {
      MasterMindSolution m1 = new MasterMindSolution(); // test default constructor
      String check1 = m1.check("****"); // expected ""
      MasterMindSolution m2 = new MasterMindSolution("R", 5); // test custom constructor
      String check2a = m2.check("RRRRR"); // expected "+++++"
      String check2b = m2.check("ABCDE"); // expected ""
      String check2c = m2.check("ARARA"); // expected "++"
   }
}