/*approach
  string, simulation
  we just follow the conditions given and change the
  bool flag accordingly whether the given number is a 
  valid digit or not and finally return the bool value*/
class Solution {
    public boolean isNumber(String s) {
        int n = s.length();
        boolean hasDigit = false, hasDot = false, hasExponent = false, hasSign = false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit = true;
            }else if(ch == '+' || ch == '-'){
                if(i>0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')){
                    return false;
                }
                hasSign = true;
            }else if(ch == 'e' || ch == 'E'){
                if(hasExponent || !hasDigit){
                    return false;
                }
                hasExponent = true;
                hasDigit = false;
            }else if(ch == '.'){
                if(hasDot || hasExponent){
                    return false;
                }
                hasDot = true;
            }else{
                return false;
            }
        }
        return hasDigit;
    }
}
