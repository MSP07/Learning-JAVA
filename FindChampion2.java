/*approach
  bit manipulation, graph
  the idea is that if 0 greater than 1 and 1 greater than 2 then 0 is automatically greater than 2
  now if we find a champion we try to check for the increased length, to do that we keep track of
  all the indices that we have seen and we use a bitset for that, then during storing at any place if
  the indices fail to follow the order then there are no champions so we return -1*/
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];
        for(int[] edge: edges ){
            indegree[edge[1]]++;
        }
        int result = -1;
        int count = 0;
        for(int i = 0 ; i < indegree.length; i++){
            if(indegree[i] == 0) {
                count++;
                result = i;
            }
        }
        return count == 1 ? result : -1;
    }
}
