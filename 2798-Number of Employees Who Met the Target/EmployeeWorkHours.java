public class EmployeeWorkHours {

    // Method to count the number of employees who worked at least target hours
    public static int countEmployees(int[] hours, int target) {
        int count = 0;

        // Iterate through each employee's work hours
        for (int hour : hours) {
            // If the employee worked at least target hours, increment the count
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] hours1 = {0, 1, 2, 3, 4};
        int target1 = 2;
        System.out.println("Output: " + countEmployees(hours1, target1)); // Output: 3

        // Test case 2
        int[] hours2 = {5, 1, 4, 2, 2};
        int target2 = 6;
        System.out.println("Output: " + countEmployees(hours2, target2)); // Output: 0
    }
}
