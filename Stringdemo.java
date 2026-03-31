public class Stringdemo {
    
     public static void main(String[] args) {
   String str1 = "Hello ";
    String str2 = "Hello ";
    String str3 = new String("Hello ");
     System.out.println("Comparing str1 si str2 " + (str1==str2));//true
     System.out.println("Comparing str1 si str3 " + (str1==str3));//false

     String str4 = str1.concat("Info 1");
          String str5 = str1 + "Info 1";
     System.out.println("Comparing str1 si str2 " + str1.equals(str3));//true
     String str6 = "Ana are mere";
     System.out.println(str6.substring(5)); 
     System.out.println(str4);
      System.out.println(str5);

}
}


