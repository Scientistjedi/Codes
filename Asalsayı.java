package asalsay�;

public class Asalsay� {
	
	public static void main(String[] args) {
		 
	for ( int i= 2; i< 1000; i++) {
		
		if(asal(i)) {
			
			System.out.println(i); 
		}
		
	}
	}
	

public static boolean asal(int say�) {
	
	for (int i =2; i < say� ;i++ ) {
		
if(say� % i== 0) {
	
	return false;
}
	
	
	}
	return true;
	
}
  





}