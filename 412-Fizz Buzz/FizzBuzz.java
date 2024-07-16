import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } 
            // Check if the current number is divisible by 3
            else if (i % 3 == 0) {
                answer.add("Fizz");
            } 
            // Check if the current number is divisible by 5
            else if (i % 5 == 0) {
                answer.add("Buzz");
            } 
            // If none of the above conditions are true, add the number as a string
            else {
                answer.add(Integer.toString(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        
        // Example input
        int n = 15;
        
        // Get the FizzBuzz result
        List<String> result = fb.fizzBuzz(n);
        
        // Print the result
        for (String s : result) {
            System.out.println(s);
        }
    }
}
