package test.auto;

public class Bread {
	protected Flour flour;
	
	 public Bread(Flour flour) {
		 this.flour=flour;
	 }
	 public void cook() {
		 if(this.flour==null) {
			 System.out.println("밀가루가 없어서 요리가 불가해요!");
			 return;
		 }
		 System.out.println("요리중!");
	 }
	

}
