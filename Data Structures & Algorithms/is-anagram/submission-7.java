class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> ht=new HashMap<>();
        HashMap<Character,Integer> st=new HashMap<>();
        for(int i=0;i<s.length();i++){
            ht.put(s.charAt(i),ht.getOrDefault(s.charAt(i),0)+1);
            st.put(t.charAt(i),st.getOrDefault(t.charAt(i),0)+1);
        }

        return ht.equals(st);
    }
}
