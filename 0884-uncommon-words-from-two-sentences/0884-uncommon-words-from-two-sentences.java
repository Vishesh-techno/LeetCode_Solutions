class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String[] s = s1.split(" ");
        for(String word: s){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        String[] t = s2.split(" ");
        for(String word: t){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for(String word: map.keySet()){
            if(map.get(word) == 1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}