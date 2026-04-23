class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        String s = licensePlate.toLowerCase().replaceAll("[\\s\\d]", "");
        char[] ch = s.toCharArray();
        for(char c: ch){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        String result = "";
        for(String word : words){
            Map<Character, Integer> temp = new HashMap<>();
            for(char cha: word.toLowerCase().toCharArray()){
                temp.put(cha, temp.getOrDefault(cha, 0)+1);
            }

            boolean valid = true;
            for(char key: map.keySet()){
                if(temp.getOrDefault(key, 0) < map.get(key)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                if(result.equals("") || word.length() < result.length()){
                    result = word;
                }
            }
        }
        return result;
    }
}