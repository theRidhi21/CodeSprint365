class Solution {
    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public long count(long x, int[] coins) {
        int n = coins.length;
        long ans = 0;
        for (int mask = 1; mask < (1 << n); mask++) {
            long common = 1;
            int bits = 0;
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    common = lcm(common, coins[i]);
                    if (common > x) {
                        valid = false;
                        break;
                    }
                }
            }
            if (!valid)
                continue;
            if (bits % 2 == 1)
                ans += x / common;
            else
                ans -= x / common;
        }
        return ans;
    }
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) coins[0] * k;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
