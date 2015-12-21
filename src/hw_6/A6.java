package hw_6;

public class A6 {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Question acct = new Question(null);
		String desc = "happy";
		acct.print(desc);
	}
}
class Question {
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	   public void print(String desc) {
	      System.out.println(desc);
	   }      
	}