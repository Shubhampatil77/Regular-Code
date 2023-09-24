package Day4;
 class This1{
	 int id;
	 String name;
	 
	 void given(int id,String name){
		this.id=id;
		this.name=name;
	 }
	 
	  void disply(){
		 System.out.println("Bahubali ko kisne mara??\n"+name+"ne mara");
	 }
 }
public class This {
	public static void main(String args[]) {
		This1 s=new This1();
		s.given(10,"Katapa");
		s.disply();
	}
}
