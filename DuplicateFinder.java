import java.util.*;

public class DuplicateFinder {
    public static List<Integer> findDuplicates(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        for (int num : list) {
            if (frequencyMap.get(num) > 1 && !result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1,2,2,3,4,5,5,6);

        System.out.println(findDuplicates(input1));

    }
}

