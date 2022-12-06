static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();


        for(int i=0; i<k; i++)
        {
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i])
                q.pollLast();

            q.push(i);
        }

        for(int i=k; i<n; i++)
        {
            a.add(arr[q.peekFirst()]);

            while(!q.isEmpty() && q.peekFirst() <= i-k)
                q.pollFirst();

            while (!q.isEmpty() && arr[q.peekLast()] < arr[i])
                q.pollLast();

            q.push(i);
        }

        a.add(arr[q.peekFirst()]);

        return a;
    }
