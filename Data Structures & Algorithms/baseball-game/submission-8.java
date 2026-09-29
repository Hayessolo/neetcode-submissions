class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (String op : operations ){
            int n = record.size();
            switch (op){
                case "+":{
                    int first = record.pop();
                    int second = record.pop();
                    record.push(second);
                    record.push(first);
                    record.push(first + second );
                break;
                }case "D":{
                    record.push(record.peek() *2);
                    break;
                }case "C":{
                    record.pop();
                    break;
                }default :{
                    record.push(Integer.parseInt(op));
                }

            
            }
        }
        int total = record.stream().mapToInt(Integer::intValue).sum();
        return total;
        
    }
}