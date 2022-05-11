Given an array arr of size N containing positive and negative integers. Arrange the array alternatively such that every non-negative integer is followed by a negative integer and vice-versa.
Note:
The number of positive integers and negative integers may not be equal. In such cases, add the extra integers at the end.
For Example:
For array {4, -9, -2, 6, -8}, the output will be {-9, 4, -2, 6, -8}

For array {1, 2, 3, -5}, the output will be {-5, 1, 2, 3}   
Input Format:
The first line contains an integer 'T' which denotes the number of test cases or queries to be run. Then, the T test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array (arr).

The second line contains 'N' single space-separated integers, representing the elements in the array.
Output Format:
For each test case, the output is “Valid” if the rearrangement is valid otherwise, “Invalid”, without quotes.
Note:
You do not need to print anything, it has already been taken care of. Just implement the given function.

For a single array, multiple solutions may be possible, just rearrange the array in any one possible way.  
Constraints:
1 <= T <= 10 
1 <= N <= 10^5
Sum of N over all test cases does not exceeds 10^5. 
-(10^9) <= arr[i] <= (10^9) 

Time limit: 1 second
Sample Input 1:
1
4
-1 2 2 -5 
Sample Output 1:
-1 2 -5 2 
  
  
  
  
  
  
  
  import java.util.ArrayList;

public class Solution 
{
    
    public static void rearrange(int[] arr) 
    {

        // This will store all positive integers.
        ArrayList<Integer> pos = new ArrayList();
       
        // This will store all negative integers.
        ArrayList<Integer> neg = new ArrayList();

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < 0) 
            {
                neg.add(arr[i]);
            }
            else 
            {
                pos.add(arr[i]);
            }
        }

        int index = 0;
        int i = 0, j = 0;

       
        while (i < pos.size() && j < neg.size()) 
        {
            if (index % 2 == 0) 
            {
                arr[index] = neg.get(j);
                j++;
            }
            else 
            {
                arr[index] = pos.get(i);
                i++;
            }

            index++;
        }

        while (i < pos.size()) 
        {
            arr[index] = pos.get(i);
            index++;
            i++;
        }

        while (j < neg.size()) 
        {
            arr[index] = neg.get(j);
            index++;
            j++;
        }

        return;

    }

}
  
