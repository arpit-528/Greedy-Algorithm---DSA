
class Solution {
    static int solve(int bt[] ) {
    // code here
    Arrays.sort(bt);
    int wt = 0;
    int t = 0;
    for(int i = 0; i <= bt.length-1; i++) {
        wt = wt + t;
        t = t + bt[i];
    }
      return (wt/bt.length);
  } 
  
}
     
