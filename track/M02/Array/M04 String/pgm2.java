public class pgm2{
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "python";
        if(s1==s2){
            System.out.println("Ref are not equal");
        } 
        else
        {
            System.out.println("Ref are equal");
        }
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Strings are same");
        }
        else{
            System.out.println("Strings are not same");
        }
    }
}