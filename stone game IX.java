class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }
        return check(count[0], count[1], count[2]) ||
               check(count[0], count[2], count[1]);
    }
    private boolean check(int zero, int one, int two) {
        if (one == 0) {
            return false;
        }
        one--;
        int turns = 1 + Math.min(one, two) * 2 + zero;
        if (one > two) {
            one--;
            turns++;
        }
        return turns % 2 == 1 && one != two;
    }
}
