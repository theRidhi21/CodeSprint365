class Solution {
    public int scoreOfParentheses(String s) {
        int b=0,c=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                c++;
            } else {
                c--;
                if (s.charAt(i - 1) == '(') {
                    b+=1<<c;
                }
            }
        }
        return b;
    }
}

or

  class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> a = new Stack<>();
        Stack<Integer> score = new Stack<>();
        int b = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                a.push('(');
                score.push(b);
                b = 0;
            }
            else {
                a.pop();
                if (b == 0) {
                    b = 1;
                }
                else {
                    b = 2 * b;
                }
                if (!score.isEmpty()) {
                    b = score.pop() + b;
                }
            }
        }
        return b;
    }
}
