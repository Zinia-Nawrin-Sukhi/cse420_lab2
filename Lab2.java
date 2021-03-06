import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab2{
    public static String URL_RegEx = "((http|https)://)(www.)?" + "[a-zA-Z0-9@:%._\\+~#?&//=]" + "{2,256}\\.[a-z]" + "{2,6}\\b([-a-zA-Z0-9@:%" + "._\\+~#?&//=]*)";
    public static String Email_RegEx = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
    static Pattern URL_PATTERN = Pattern.compile(URL_RegEx);
    static Pattern Email_PATTERN = Pattern.compile(Email_RegEx);
    public static boolean IsValid(String s){
    if( s == null){
        return false;
        }
    else if(URL_PATTERN.matcher(s).matches()){
        return URL_PATTERN.matcher(s).matches();
    }
    else{
     return Email_PATTERN.matcher(s).matches();
    }
    
  }
 public static void main(String []args){
     Scanner sc = new Scanner (System.in);
     System.out.println("enter a Number");
     int n = sc.nextInt();
     for(int i=0;i<=n;i++){
     String s = sc.nextLine();
     if(IsValid(s)){
     System.out.print(  s + " ," + i);
     }
  }
     
 }
 }

