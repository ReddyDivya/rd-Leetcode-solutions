public class FinalValueOfX {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String[] operations1 = {"--X", "X++", "X++"};
        String[] operations2 = {"++X", "++X", "X++"};
        String[] operations3 = {"X++", "++X", "--X", "X--"};

        System.out.println("Final value of X for operations1: " + finalValueAfterOperations(operations1)); // Output: 1
        System.out.println("Final value of X for operations2: " + finalValueAfterOperations(operations2)); // Output: 3
        System.out.println("Final value of X for operations3: " + finalValueAfterOperations(operations3)); // Output: 0
    }
}
