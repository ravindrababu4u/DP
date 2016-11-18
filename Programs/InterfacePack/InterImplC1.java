package InterfacePack;

public   class InterImplC1 implements Inerface1,Interface2 {

	public void m1() {
     System.out.println("This is from m1 of InterImplC1");
	}

	public void m2() {
		System.out.println("This is from m2 of InterImplC1");
	}

	public void m3() {
		System.out.println("This is from m3 of InterImplC1");
	}

	public   void m4() {
		System.out.println("This is from m4 of InterImplC1");
	}

	public void m5() {
		System.out.println("This is from m5 of InterImplC1");
	}

	public static void main(String[] args) {
		InterImplC1 ic= new InterImplC1();
		ic.m1();
		ic.m2();
		ic.m3();
		ic.m4();
		ic.m5();
		ic.m21();
		ic.m22();
		ic.m23();
		//ic.universityName="Adisaababa";
		ic.m24();
		System.out.println(ic.universityName);
		
	}

	public void m21() {
		System.out.println("This is from  m21");
	}

	public void m22() {
		System.out.println("This is from  m22");
	}

	public void m23() {
		System.out.println("This is from  m23");
		
	}

	public void m24() {
		System.out.println("This is from  m24");
		
	}

}
