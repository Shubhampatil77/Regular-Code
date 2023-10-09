package LabManualDemo;
class nestedinterface{
	int a;
	}
nestedinterface(int a){
	this.a=a;
}

interface print{
	void print(string str);
}
}

class nesteddemo extends nestedinterface implemnts nestedinterface.print{
	int b;
	nesteddemo(int a,int b)
	{
		super(a);
		this.b=b;
	}
	piblic void print(String str) {
		System.out.println("str+a+"&"")
	}
}
public class Interfacedemo2 {

	public static void main(String[] args) {
		
	}

}
