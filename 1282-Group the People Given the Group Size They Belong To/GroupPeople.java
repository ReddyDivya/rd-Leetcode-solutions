import java.util.*;

public class GroupPeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Traverse the groupSizes array
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            // If the group size is not in the map, add it
            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }
            
            // Add the person to the group
            map.get(size).add(i);
            
            // If the group reaches the required size, add it to the result and reset the group
            if (map.get(size).size() == size) {
                result.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        GroupPeople gp = new GroupPeople();
        
        int[] groupSizes1 = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(gp.groupThePeople(groupSizes1)); // Output: [[5],[0,1,2],[3,4,6]]

        int[] groupSizes2 = {2, 1, 3, 3, 3, 2};
        System.out.println(gp.groupThePeople(groupSizes2)); // Output: [[1],[0,5],[2,3,4]]
    }
}
