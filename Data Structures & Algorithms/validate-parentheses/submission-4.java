class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> store =Map.of( ')','(','}','{',']','[');
        Stack<Character> counter = new Stack<>();
        for(char  c : s.toCharArray() ){
            if( store.containsKey(c) && !(counter.empty())){
                if(store.get(c) == counter.peek()){
                    counter.pop();
                }else{
                    return false;
                }

            }else{
                counter.push(c);
            }
        }
        return true;

    }
}
