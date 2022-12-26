// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    static void seperateTwoElement(int[] arr, int firstElement, int secondElement)
    {
        int l=0;
        int r = arr.length-1;
        
        while(true)
        {
            while(arr[l] == firstElement && l < r)
                l++;
            
            while(arr[r] == secondElement && l < r)
                r--;
            
            if(l > r)
                break;
            
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            
            l++;
            r--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,1};
        seperateTwoElement(arr, 0, 1);
        for(int i : arr)
            System.out.print(i + " ");
    }
}
