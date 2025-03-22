import java.util.*;

public class OriginalFinder {
    public static List<Integer> findOriginal(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for (int number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }


        for (int numebr : list) {
            if (frequencyMap.get(numebr) > 1 && !result.contains(numebr)) {
                result.add(numebr);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1,2,2,3,4,5,5,6);

        System.out.println(findOriginal(input1));

    }
}

