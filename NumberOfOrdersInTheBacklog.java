/*approach
  priority_queue,simulation
  if its to sell then we compare with buy and vice versa so
  we use two pq one maxheap(sell) and one minheap(buy) depending on the
  type we check for elements in the pq and take that and take the min out of 
  amount and the sell/buy amount and subtract that from amount and sell/buy amount
  and push that back into that particular pq and after that we check if there is an amount and
  push the price,amount pair in the other pq and finally we take the amount from all the elements in
  both the pq's and modulo them with 1e9+7 and finally return the answer*/
class Solution {
    public int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<int[]> buyPQ = new PriorityQueue<>((a,b)->b[0]-a[0]); 
        PriorityQueue<int[]> sellPQ = new PriorityQueue<>(Comparator.comparingInt(a->a[0])); 
        int MOD = 1_000_000_007;
        for(int[] order:orders){
            int price = order[0], amount = order[1], type = order[2];
            if(type == 0){ 
                while(amount > 0 && !sellPQ.isEmpty() && sellPQ.peek()[0] <= price){
                    int[] sellOrder = sellPQ.poll();
                    int executed = Math.min(amount, sellOrder[1]);
                    amount -= executed;
                    sellOrder[1] -= executed;
                    if (sellOrder[1] > 0) {
                        sellPQ.offer(sellOrder);
                    }
                }
                if(amount > 0){
                    buyPQ.offer(new int[]{price, amount});
                }
            }else{ 
                while(amount > 0 && !buyPQ.isEmpty() && buyPQ.peek()[0] >= price){
                    int[] buyOrder = buyPQ.poll();
                    int executed = Math.min(amount, buyOrder[1]);
                    amount -= executed;
                    buyOrder[1] -= executed;
                    if (buyOrder[1] > 0) {
                        buyPQ.offer(buyOrder);
                    }
                }
                if (amount > 0) {
                    sellPQ.offer(new int[]{price, amount});
                }
            }
        }
        long result = 0;
        while(!buyPQ.isEmpty()){
            result = (result + buyPQ.poll()[1]) % MOD;
        }
        while(!sellPQ.isEmpty()){
            result = (result + sellPQ.poll()[1]) % MOD;
        }
        return (int)result;
    }
}
