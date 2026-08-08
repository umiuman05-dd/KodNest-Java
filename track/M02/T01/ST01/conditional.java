public class conditional {
    public static void main(String[] args) {
        int number = -7;
        int firstScore = 18;
        int secondScore = 25;
        
        
        if (number > 0) {
            System.out.println("Number type: Positive");
        } else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }
        
        
        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }
        
        
        if (firstScore > secondScore) {
            System.out.println("Comparison: First score is higher");
        } else if (firstScore < secondScore) {
            System.out.println("Comparison: Second score is higher");
        } else {
            System.out.println("Comparison: Scores are equal");
        }
    }
}