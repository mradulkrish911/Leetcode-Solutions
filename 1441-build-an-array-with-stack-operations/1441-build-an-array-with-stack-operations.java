class Solution {

    public List<String> buildArray(int[] target, int n) {

        List<String> li = new ArrayList<>();

        int j = 0;

        for(int i = 1; i <= n; i++) {

            li.add("Push");

            if(target[j] == i) {

                j++;

                if(j == target.length) {
                    break;
                }

            } else {

                li.add("Pop");
            }
        }

        return li;
    }
}