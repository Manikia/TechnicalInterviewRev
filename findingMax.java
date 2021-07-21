/*Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. 
The maximum number of consecutive 1s is 3.
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) //moving through array as long as it continues
        {
            if (nums[i] == 1) //looks for 1 in the array and increments if found
            {
                result = Math.max(result, ++count); //returns bigger number between both
            } else {
                count = 0; //it resets it if it hits something aside from 1
            }
            //then loops back again to increment
        }
        return result;
    }
}

/*
 * OTHER SOLUTION:


 class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        // we know we only count the 1s and if it hits anything else than 1 we end it
        // and begin again if its not the end of the array
        for (int i = 0; i < nums.length; i++) // as long as the array continues
        {
            if (nums[i] == 1) // if it has 1 then we continue adding up
            {
                counter++;
            } else {
                counter = 0;
            }
            // for my code it read the last one to be the biggest but its not so what we are
            // going to do is compare the previous bigger one to the current bigger one so
            // that we dont push the wrong large number out
        }
        return counter;
    }
}


FIXED OTHER SOLUTION CODE:

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        //we know we only count the 1s and if it hits anything else 
        //than 1 we end it and begin again if its not the end of the array
        
        for(int i = 0; i < nums.length; i++) //as long as the array continues
        {
            if(nums[i] == 1) //if it has 1 then we continue adding up
            {
                counter++;
                result = Math.max(result, counter); //the math.max compares the previous 
                                                    //bigger one to current one and sets the bigger one to result
            }
            else
            {
                counter = 0;
            }
            //for my code it read the last one to be the biggest 
            //but its not so what we are going to do is compare the previous 
            //bigger one to the current bigger one so that we dont push the wrong large number out
        }
        return result;
    }
}
*/