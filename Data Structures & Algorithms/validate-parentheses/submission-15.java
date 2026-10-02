class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closed = new HashMap<>(Map.of(')','(','}','{',']','['))
;
        Stack<Character> open = new Stack<>();
        for (char c : s.toCharArray()){
            if (closed.containsKey(c) && open.size() > 0){
                if (closed.get(c) == open.peek() ){
                    open.pop();

                }else{
                    return false;
                }
            }else{
            open.push(c);
            }
        }
        if (open.size() > 0){
             return false ;
         }else{
             return true;
         }   
    }
}
