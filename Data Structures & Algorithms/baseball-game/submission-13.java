class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for(String op :operations){
            switch (op){
                case "+":{
                    int last = record.getLast();
                    int secondL = record.get(record.size() -2);
                    record.addLast(last + secondL);
                    break;
                }
                case "D":{
                    int last = record.getLast();
                    record.addLast(last *2);
                break;
                }
                case "C":{
                    record.removeLast();
                    break;
                }
                default:{
                    record.addLast(Integer.parseInt(op));
                }

            }
        }
        int total = record.stream().mapToInt(Integer::intValue).sum();
        return total;
    }
}