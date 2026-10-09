class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closed = new HashMap<>(Map.of(')','(', '}','{',  ']','['));
        Stack<Character> open = new Stack<>();
        for (char c :s.toCharArray()){
            if (closed.containsKey(c)  && open.size() >0){
                if (closed.get(c) ==open.peek()){
                    open.pop();
                }else{
                    return false;
                }

            }else{
                open.push(c);
            }
        }
        Boolean res = open.size()>0?false:true;
        return res;

        
    }
}
