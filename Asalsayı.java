package asalsayý;

public class Asalsayý {
	
	public static void main(String[] args) {
		 
	for ( int i= 2; i< 1000; i++) {
		
		if(asal(i)) {
			
			System.out.println(i); 
		}
		
	}
	}
	

public static boolean asal(int sayý) {
	
	for (int i =2; i < sayý ;i++ ) {
		
if(sayý % i== 0) {
	
	return false;
}
	
	
	}
	return true;
	
}
  





}