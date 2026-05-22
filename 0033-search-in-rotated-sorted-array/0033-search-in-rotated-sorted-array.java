class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            // Array is not rotated, just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot element is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target >= first element, it means target is in the left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Not found
    }

    int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid > next
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // Case 2: mid < prev
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            // Case 3: shrink search space
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}