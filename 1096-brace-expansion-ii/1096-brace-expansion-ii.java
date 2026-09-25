class Solution {

    public List<String> braceExpansionII(String expression) {
        Deque<Character> op = new ArrayDeque<Character>();
        List<Set<String>> stk = new ArrayList<Set<String>>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == ',') {
                // Keep popping operators from the top of the stack until the stack is empty or its top is not a multiplication sign
                while (!op.isEmpty() && op.peek() == '*') {
                    ope(op, stk);
                }
                op.push('+');
            } else if (expression.charAt(i) == '{') {
                // First determine whether a multiplication sign needs to be added, then push { onto the operator stack
                if (
                    i > 0 &&
                    (expression.charAt(i - 1) == '}' ||
                        Character.isLetter(expression.charAt(i - 1)))
                ) {
                    op.push('*');
                }
                op.push('{');
            } else if (expression.charAt(i) == '}') {
                // Keep popping operators from the top of the stack until its top is {
                while (!op.isEmpty() && op.peek() != '{') {
                    ope(op, stk);
                }
                op.pop();
            } else {
                // First determine whether a multiplication sign needs to be added, then push the newly constructed set onto the set stack
                if (
                    i > 0 &&
                    (expression.charAt(i - 1) == '}' ||
                        Character.isLetter(expression.charAt(i - 1)))
                ) {
                    op.push('*');
                }
                StringBuilder sb = new StringBuilder();
                sb.append(expression.charAt(i));
                stk.add(
                    new TreeSet<String>() {
                        {
                            add(sb.toString());
                        }
                    }
                );
            }
        }

        while (!op.isEmpty()) {
            ope(op, stk);
        }
        return new ArrayList<String>(stk.get(stk.size() - 1));
    }

    // Pop the operator at the top of the stack and perform the calculation
    public void ope(Deque<Character> op, List<Set<String>> stk) {
        int l = stk.size() - 2,
            r = stk.size() - 1;
        if (op.peek() == '+') {
            stk.get(l).addAll(stk.get(r));
        } else {
            Set<String> tmp = new TreeSet<String>();
            for (String left : stk.get(l)) {
                for (String right : stk.get(r)) {
                    tmp.add(left + right);
                }
            }
            stk.set(l, tmp);
        }
        op.pop();
        stk.remove(stk.size() - 1);
    }
}