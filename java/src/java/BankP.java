package java;
class BankP {
	
	float getRateOfInterest() {
		return 0;
	}
}

class ICICI extends BankP{
	
	
	float getRateOfInterest() {
		return 5.6f;
	}
}	
class HDFC extends BankP{
		
}
class main{		
	
	public static void main(String[] args) {
		BankP obj;
		obj=new ICICI();
		System.out.println("ICICI rate of interest:"+obj.getRateOfInterest());
		obj=new HDFC();
		System.out.println("HDFC rate of interest:"+obj.getRateOfInterest());
		
		
	}		
}


	



	
	

	
	


