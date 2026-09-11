class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> ht=new HashMap<>();
        for(char c : s.toCharArray()){
            ht.put(c,ht.getOrDefault(c,0)+1);
        }
        List<Character> sortedChars=new ArrayList<>(ht.keySet());
        Collections.sort(sortedChars, (a, b) -> ht.get(b) - ht.get(a));
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(ht.get(c)));
        }
        return result.toString();
    }
} 