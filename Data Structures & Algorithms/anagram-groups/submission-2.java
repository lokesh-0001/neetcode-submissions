class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] array=s.toCharArray();
            Arrays.sort(array);
            String sortedS=new String(array);
            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
