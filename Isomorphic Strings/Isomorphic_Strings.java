class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mpp = new HashMap<>();
        HashMap<Character,Character> mpp2 = new HashMap<>();
        int n = s.length();
        for(int i =0; i<n; i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if(mpp.containsKey(si)) {
                if(mpp.get(si) != ti) return false;
            }
            if(mpp2.containsKey(ti)) {
                if(mpp2.get(ti) != si) return false;
            }
            mpp.put(si,ti);
            mpp2.put(ti,si);
        }
        return true;
    }
}