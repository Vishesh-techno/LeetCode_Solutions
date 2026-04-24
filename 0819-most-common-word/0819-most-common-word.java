class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        String[] para = paragraph.toLowerCase()
                                 .replaceAll("[^a-z]", " ")
                                 .split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        
        String res = "";
        int max = 0;

        for(String word: para){

            if(set.contains(word)){
                continue;
            }

            map.put(word, map.getOrDefault(word, 0)+1);

            if(map.get(word) > max){
                max = map.get(word);
                res = word;
            }
        }
        return res;
    }
}