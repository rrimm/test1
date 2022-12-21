
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
        String inputId = args[0];
        
        String pass = "11111";
        String inputPass = args[1];
        
        
         
        System.out.println("Hi.");
         
        if(inputId.equals(id)) {
        	 if(inputPass.equals(pass)) {
            System.out.println("Master!");
        	 } else {
        		 System.out.println("Wrong!");
        	 }
        } else {
            System.out.println("Who are you?");
        }
        
	}

}
