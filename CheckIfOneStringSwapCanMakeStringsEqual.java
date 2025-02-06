/*apprpach
  hashmap, counting
  since we can make atmost one swap then the two stirngs should have
  only two diff chars more than that we return false and so we store the
  indices of diff chars in the string and after swapping we return whether 
  they are equal or not*/
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int[] diffIndices = new int[2];
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if (count >= 2) return false; 
                diffIndices[count++] = i;
            }
        }

        if (count != 2) return false;
        char[] s1Array = s1.toCharArray();
        char temp = s1Array[diffIndices[0]];
        s1Array[diffIndices[0]] = s1Array[diffIndices[1]];
        s1Array[diffIndices[1]] = temp;

        return new String(s1Array).equals(s2);
    }
}
