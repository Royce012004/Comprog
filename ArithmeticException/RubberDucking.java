public class RubberDucking {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.print("The sum is: " + sum);
        System.out.println("\nNext Program...");
        
        String word = "Sebastian Royce Cristobal";
        String reversedWord = reverseString(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverseString(String str) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}
