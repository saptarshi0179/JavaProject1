import java.util.ArrayList;
import java.util.Scanner;

public class q02EmailIDVerification {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("sam.cruz@gmail.com");
        emailID.add("aron.roy@gmail.com");
        emailID.add("kim.paul@gmail.com");
        emailID.add("saptarshi.m@gmail.com");
        emailID.add("henry.ford@gmail.com");
        emailID.add("aryan.ghosh@gmail.com");
        emailID.add("avirup.bar@gmail.com");
        emailID.add("onkar.pal@gmail.com");
        emailID.add("subhayu.sutar@gmail.com");
        emailID.add("abhishek.mondal@gmail.com");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Email-ID you want to find");
        String searchEmail = sc.nextLine();
        if(emailID.contains(searchEmail)){
           System.out.println( "Email-ID :" + searchEmail + " found");
        }
        
        else{
        	 System.out.println( "Email-ID :" + searchEmail + " not found");
        }
    
    }
}