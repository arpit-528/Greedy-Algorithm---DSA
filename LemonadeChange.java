class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0; i<bills.length; i++) {
            if(bills[i]==5) {
                five += 1;
                //i++;
            }  else if(bills[i]==10) {
                if(five != 0) {
                    five -= 1;
                    ten += 1;
                    //i++;
                } else {
                    return false;
                }
            } else {
                if(ten >= 1 && five >= 1) {
                     ten -= 1;
                    five-= 1;
                    //i++;
                } else if(five >= 3) {
                    five-= 3;
                    //i++;
                } else {
                 return false;
              }
            }
        }
        return true;
    }
}
// Do not use i++ because loop is automatically incrementing itself. Writing i++ would skip some of the elements.
