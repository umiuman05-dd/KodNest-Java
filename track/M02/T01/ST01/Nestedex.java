
public class Nestedex {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int i = 1; i <= 4; i++) {
                if (i == 2) {
                    break;
                }
                System.out.println("i: " + i + "  j: " + j);
            }
        }
    }
}
