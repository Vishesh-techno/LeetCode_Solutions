class Solution {
    public String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<>();
        String s1 = "qwertyuiop";
        for(int i=0; i<s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        Set<Character> set2 = new HashSet<>();
        String s2 = "asdfghjkl";
        for(int i=0; i<s2.length(); i++){
            set2.add(s2.charAt(i));
        }
        Set<Character> set3 = new HashSet<>();
        String s3 = "zxcvbnm";
        for(int i=0; i<s3.length(); i++){
            set3.add(s3.charAt(i));
        }

        List<String> res = new ArrayList<>();
        for(String word: words){
            char[] ch = word.toLowerCase().toCharArray();
            Set<Character> target;
            if(set1.contains(ch[0])){
                target = set1;
            }else if(set2.contains(ch[0])){
                target = set2;
            }else {
                target = set3;
            }

            boolean isValid = true;
            for(char c: ch){
                if(!target.contains(c)){
                    isValid = false;
                    break;
                }
            }

            if(isValid){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}