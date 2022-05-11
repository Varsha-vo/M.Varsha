Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
  
  Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes array arr, size of the array L and N as input parameters and returns True if required pair exists, else return False.

Expected Time Complexity: O(L* Log(L)).
Expected Auxiliary Space: O(1).

Constraints:
1<=L<=104 
1<=Arr[i]<=105 

0<=N<=105
  
  
  
  
  
  
  
  
  
  
//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
       Arrays.sort(arr);
       
       int p1 = 0, p2 = 1;
       
        while(p2<size)
        {
            if( (arr[p2]-arr[p1])==n )
                    {
                        return true;
                     }
            else if((arr[p2]-arr[p1])>n)
            {
                p1++;
                
                if(p1==p2)
                {
                    p2++;
                }
            } 
                else 
                {
                    p2++;
                }
            
        }
        return false;
    }
}
