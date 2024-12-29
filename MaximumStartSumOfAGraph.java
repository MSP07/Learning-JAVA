/*approach
  graph, greedy, priority_queue
  since the objective is to find max star sum for k nodes
  we first form a adj list to find the weight of neighbors for ith node
  then we iterate from 0 to n and for each node we take the weight of
  neighboring nodes. since we need max one we only take nodes with positive weights
  and then we declare priority queue and add those weights to it then we compute 
  the sum of weights of top k neighboring weights and keep track of max one and return it*/
class Solution{
    public int maxStartSum(int[] vals,int[][] edges,int k){
        int n = vals.length;
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(vals[edge[1]]);
            adj.get(edge[1]).add(vals[edge[0]]);
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int neighbor:adj.get(i)){
                if(neighbor>0){
                    maxHeap.add(neighbor);
                }
            }
            int currSum = vals[i];
            for(int j=0;j<k&&!maxHeap.isEmpty();j++){
                currSum += maxHeap.poll();
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
