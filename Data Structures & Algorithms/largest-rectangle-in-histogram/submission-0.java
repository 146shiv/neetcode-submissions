class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;

        Stack<Integer> st = new Stack<>();

        int largest_rectangle = 0;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                int height = heights[st.pop()];

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                int area = height * width;

                largest_rectangle = Math.max(largest_rectangle, area);
            }

            st.push(i);
        }

        
        while (!st.isEmpty()) {

            int height = heights[st.pop()];

            int width;

            if (st.isEmpty()) {
                width = n;
            } else {
                width = n - st.peek() - 1;
            }

            int area = height * width;

            largest_rectangle = Math.max(largest_rectangle, area);
        }

        return largest_rectangle;
    }
}
