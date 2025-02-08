
class Solution {
    public int[] queryResults(int limit, int[][] a) {
        Map<Integer, Integer> map = new HashMap<>(); // Ball -> Color
        Map<Integer, Integer> colorCount = new HashMap<>(); // Color -> Count
        Set<Integer> set = new HashSet<>(); // Unique colors
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int x = a[i][0]; // Ball ID
            int y = a[i][1]; // Color

            if (map.containsKey(x)) {
                int oldColor = map.get(x);
                if (oldColor != y) {
                    // Decrease count of the old color safely
                    colorCount.put(oldColor, colorCount.getOrDefault(oldColor, 0) - 1);
                    
                    // If no balls use the old color, remove it from set
                    if (colorCount.get(oldColor) == 0) {
                        set.remove(oldColor);
                    }
                    
                    // Assign new color
                    map.put(x, y);
                } else {
                    // No change in color, just store the result
                    res[i] = set.size();
                    continue;
                }
            } else {
                // Assign the ball its new color
                map.put(x, y);
            }

            // Increase count of the new color
            colorCount.put(y, colorCount.getOrDefault(y, 0) + 1);
            set.add(y);

            // Store current number of unique colors
            res[i] = set.size();
        }

        return res;
    }
}
