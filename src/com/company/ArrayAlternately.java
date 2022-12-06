public static void rearrange(long arr[], int n){
        
        // Your code here
        int max = n-1;
        int min = 0;
        
        long maxElement = maxE(arr) + 1;
        
        for(int i=0; i<n; i++)
        {
            if(i%2 == 0)
            {
                arr[i] = arr[i] + arr[max] % maxElement * maxElement;
                max--;
            }
            else
            {
                arr[i] = arr[i] + arr[min] % maxElement * maxElement;
                min++;
            }
        }
        
        for(int i=0; i<n; i++)
            arr[i] /= maxElement;
    }
    
    static long maxE(long[] arr)
    {
        long m = -1;
        
        for(long l : arr)
            m = Math.max(m, l);
            
        return m;
    }
