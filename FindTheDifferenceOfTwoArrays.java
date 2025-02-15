/*approach
  hashmap
  we use hashmap to keep count of all elements in nums1 and nums2
  and we use them to check nums in nums1 and nums2 that are not present
  on the other one and add that to a temp and add that temp to ans and finally return it*/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        List<Integer> unique1 = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) unique1.add(num);
        }
        for (int num : set2) {
            if (!set1.contains(num)) unique2.add(num);
        }
        return Arrays.asList(unique1, unique2);
    }
}
