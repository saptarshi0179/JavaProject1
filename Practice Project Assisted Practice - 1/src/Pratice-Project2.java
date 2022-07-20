class DefaultaccessSpecifier{ 
  void display() 
     { 
         System.out.println("You are using default access specifier"); 
     } 
} 

public class q02AccessSpecifiers {
	

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			DefaultaccessSpecifier obj = new DefaultaccessSpecifier(); 		  
	        obj.display(); 

		}
	}