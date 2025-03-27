/*approach
  sorting
  the given condition only satisfies if all the elements in the
  matrix are of same parity so we first flatten the given 2x2 to 1x1 vector
  and then check whethere there exists a diff parity if so we return -1 immediately
  now we sort the 1d vector to find median which is the centre element and in the 1d vector
  we traverse the abs diff btn num and median / x is the no of steps needed so we calculate that
  sum that up and finally return it*/
class Solution {
public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int index = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                arr[index++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];
        int steps = 0;
        for(int num : arr){
            if(num == median){
                continue;
            }
            if(Math.abs(num - median) % x != 0){
                return -1;
            }
            steps += (Math.abs(num - median) / x);
        }
        return steps;
    }
}
