/*approach
  string, hashmap
  destination city or the final destination city will not be in
  the starting city so we use a hashmap to store all the starting 
  cities and iterate through paths and if we not find any destination
  city in the hashmap that is our answer*/
class Solution{
    public String destCity(List<List<String>> paths){
        Set<String>hashi = new HashSet<>();
        for(List<String>path:paths){
            hashi.add(path.get(0));
        }
        for(List<String>path:paths){
            if(!hashi.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}
