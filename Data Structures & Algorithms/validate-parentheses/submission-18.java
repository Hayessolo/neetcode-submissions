class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closed = new HashMap<>(Map.of(')','(', '}','{',  ']','['));
        Stack<Character> open= new Stack<>();
        for (Character c: s.toCharArray()){
            if (closed.containsKey(c) && !open.isEmpty()){
                if (closed.get(c) == open.peek()){
                    open.pop();
                }else{
                    return false;
                }
            }else{
                open.push(c);
            }

        }
        return open.isEmpty()?  true : false;
    }
}
