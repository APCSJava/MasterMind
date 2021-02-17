public class MasterMindSolution extends MasterMind {

   private String secret;
   
   // precondition - alpha.length()>0  num>0
   public MasterMindSolution(String alpha, int num) {
      secret = "";
      for (int i = 0; i<num; i++) {
         int index = (int) (Math.random()*alpha.length());
         secret += alpha.substring(index, index+1);
      }
   }

   public MasterMindSolution() {
      this("ORGYBP", 4);
   }

   // precondition - guess.length() == secret.length()
   public String check(String guess){
      int numMatching = 0;
      int numOutOfOrder = 0;
      for (int i = 0; i<secret.length(); i++) {
         String s = secret.substring(i, i+1);
         String g = guess.substring(i, i+1);
         if (s.equals(g)) numMatching++;
         else if (secret.indexOf(g)>=0) numOutOfOrder++;
      }
      String feedback = "";
      for (int i = 0; i<numMatching; i++) feedback+="+";
      for (int i = 0; i<numOutOfOrder; i++) feedback+="-";
      return feedback;
   }




}