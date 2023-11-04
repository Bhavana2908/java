package java;
public class SBI extends BankP{
	float getrteofinterest() {
		return 4.5f;
	}




		
	

	
public class BankP{
public static void main(String[] args) {
			
	
		BankP obj;
		
		obj=new SBI();
		System.out.println("SBI rate of interest:"+obj.getrateofinterest());
		obj=new ICICI();
		System.out.println("ICICI rate of interest:"+obj.getrateofinterest());
		obj=new HDFC();
		System.out.println("HDFC rate of interest:"+obj.getrateofinterest());
		
		
		// TODO Auto-generated method stub

	}

}
