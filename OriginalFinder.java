import java.util.*;

public class OriginalFinder {
    public static List<Integer> findOriginal(List<Integer> integer) {
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for (Integer number : integer) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }


        for (Integer numebr : integer) {
            if (frequency.get(numebr) > 1 && !result.contains(numebr)) {
                result.add(numebr);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6);

        System.out.println(findOriginal(input1));

    }
}

