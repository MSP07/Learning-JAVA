/*approach
  string
  we use the inbuilt function of java to seperate strings within given string based on " "
  and after that we iterate on the new modified array and if we find the searchWord we return the index+1
  else after full iteration we return -1*/
class Solution{
    public int isPrefixOfWord(String sentence,String searchWord){
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(searchWord))return i+1;
        }
        return -1;
    }
}
