package blind75;

public class BadVersion {
	public static void main(String[] args) {
        // Test the firstBadVersion function
        int n = 10; // The total number of versions
        int firstBad = 4; // The index of the first bad version

        Solution solution = new Solution();
        int result = solution.firstBadVersion(n, firstBad);

        System.out.println("The first bad version is at index: " + result);
    }
}

class Solution {
    public boolean isBadVersion(int version) {
        // This method simulates the API call to check if a version is bad
        // You can implement this method based on your problem's requirements
        return version >= 4; // Assuming version 4 and later are bad versions
    }

    public int firstBadVersion(int n, int firstBad) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left; // The first bad version will be at 'left'
    }
    }


