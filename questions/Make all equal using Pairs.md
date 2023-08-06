# Make all equal using Pairs
## [Codechef Problem Link](https://www.codechef.com/problems/PAIREQ?tab=statement)

**My Approach**

* Sort the Array
> Time Complexity O(nlogn)
* find the Maximum Frequency
> Time Complexity O(n)
* return Array.length - Maximum Frequency

Total Time Complexity is O(nlogn)

Total Space Complexity is O(1) if the input is from codechef

**Optimize Approach**
* Intialize two arrays
    * `int[] arr = new int[n]`
    * `int[] frequency = new int[1001]`
> With the help of frequency array we can increement `frequency[arr[i]]++`
* Sort the Frequency array and the last element will be the Highest Frequency
* return `Array.length - frequency[1000]`

### My Approach Code
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    
    static int maxFrequency(int[] arr)
    {
        Arrays.sort(arr);

        int n = arr.length;
        int currElemnt = arr[0];

        int maxFreq = 1;
        int currMaxFreq = 1;

        for(int i = 1; i < n; i++){

            if(currElemnt == arr[i]){
                currMaxFreq++;
                
            }else{
                currElemnt = arr[i];

                if(currMaxFreq >= maxFreq){
                    maxFreq = currMaxFreq;
                }
                currMaxFreq = 1;
            }
        }
        return maxFreq < currMaxFreq ? currMaxFreq : maxFreq;
    }
	public static void main (String[] args)
	{
        Scanner input = new Scanner(System.in);
		int t = input.nextInt();
        int minimum;

        for(int i = 0; i < t; i++){
            minimum = 0;
            int n = input.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = input.nextInt();
            }
            System.out.println(n-maxFrequency(a));
        }

        input.close();
	}
}
```

### Optimize Approach Code
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int minimum;

        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
		    int[] arr = new int[n];
		    int[] frequency = new int[1001];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=input.nextInt();
		        frequenc[arr[i]]++;
		    }
            Arrays.sort(fre);
            System.out.println(n-fre[1000]);
        }
        input.close();
    }
}
```