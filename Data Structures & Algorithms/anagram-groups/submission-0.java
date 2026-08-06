

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);

            // If the key is not in the map, add it with an empty list
            if (!res.containsKey(sortedStr)) {
                res.put(sortedStr, new ArrayList<>());
            }

            // Retrieve the list and add the original string
            res.get(sortedStr).add(s);
        }

        return new ArrayList<>(res.values());
    }
}