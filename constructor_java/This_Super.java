package constructor_java;

class p{
	String s="parent variable";
}

class c extends p{
    String s="child variable";
    public void m1() 
    {	
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(super.s);
}
public class This_Super extends p {

	public static void main(String[] args) {
	c C= new c();
	}

}
}
