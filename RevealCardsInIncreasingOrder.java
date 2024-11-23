/*approach
  sorting, simulation
  we first the given array and then start adding elements
  we do so in the logic that the elements should fit in inside the indices that leaves no remainder
  if the sorted array is appended in this order then we will get the required answer. This can also be
  implemented using queue*/
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int result[] = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i=0; i<deck.length; i++){
            q.add(i);
        }
        int i=0;
        while(i<deck.length){
            result[q.poll()] = deck[i];
            if(q.isEmpty()) return result;
            q.add(q.remove());
            i++;
        }
        return result;
    }
}
