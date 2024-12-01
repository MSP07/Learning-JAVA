/*approach
  priority queue, simulation
  our task is to leave the sqrt of the highest number after every iteartion
  so we use a maxHeap that keeps max numbers at the top and then we  replace 
  the org numbers with their sqrt for k times and then find calculate their
  total and return it finally*/
class Solution{
    public long pickGifts(int[] gifts,int k){
        long leftbehind = 0;
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int gift:gifts){
            maxHeap.add(gift);
        }
        while(k-->0){
            int maxi = (int)Math.sqrt(maxHeap.poll());
            maxHeap.add(maxi);
        }
        while(!maxHeap.isEmpty()){
            leftbehind += maxHeap.poll();
        }
        return leftbehind;
    }
}
