class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>();
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.",
        "....","..",".---","-.-",".-..","--","-.","---",".--.",
        "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int i = 0;
        for(char c='a'; c<='z'; c++){
            map.put(c, s[i++]);
        }

        Set<String> set = new HashSet<>();
        for(String word: words){
            StringBuilder sb= new StringBuilder();
            for(char c: word.toCharArray()){
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}