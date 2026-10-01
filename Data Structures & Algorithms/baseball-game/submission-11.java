class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (String op : operations){
            switch (op){
                case "+":
                    int one = record.pop();
                    int two =record.peek();
                    record.push(one);
                    record.push(one + two);
                    break;
                case "D":
                    record.push(record.peek() *2);
                    break;
                case "C":
                    record.pop();
                    break;
                default:
                    record.push(Integer.parseInt(op));


            }
             
        }
        int total = record.stream().mapToInt(Integer::intValue).sum();
        return total;
        
    }
}