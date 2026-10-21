class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closed = new HashMap<>(Map.of(')','(', '}','{',  ']','['));
        Stack<Character> open= new Stack<>();
        for (Character c: s.toCharArray()){
            if (closed.containsKey(c) && !open.isEmpty()){}
        }
    }
}
