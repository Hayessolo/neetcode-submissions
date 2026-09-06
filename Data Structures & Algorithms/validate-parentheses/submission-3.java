class Solution {
    public boolean isValid(String s) {
        Map<String, String> store =Map.of( ")","(","}","{","]","[");
        Stack<Character> counter = new Stack<>();
        for(char  c : s.toCharArray() ){
            if( store.containsKey(c) && !(counter.empty())){
                if(store.get(c) == String.valueOf(counter.peek())){
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
