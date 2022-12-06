static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> a = new ArrayList<>();
        
        int top = 0;
        int down = r-1;
        int left  = 0;
        int right = c-1;
        
        int d = 0;
        
        while(top <= down && left <= right)
        {
            if(d == 0)
            {
                for(int i=left; i<=right; i++)
                    a.add(matrix[top][i]);
                    
                top++;
            }
            else if(d==1)
            {
                for(int i=top; i<=down; i++)
                    a.add(matrix[i][right]);
                
                right--;
            }
            else if(d==2)
            {
                for(int i=right; i>=left; i--)
                    a.add(matrix[down][i]);
                
                down--;
            }
            else
            {
                for(int i=down; i>=top; i--)
                    a.add(matrix[i][left]);
                    
                left++;
            }
            
            d = (d+1) % 4;
        }
        
        return a;
    }
