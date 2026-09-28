class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record= new ArrayList<>();
        
        for(String op : operations){
            int n = record.size();
            switch (op){
                case "+":
                    record.addLast(record.getLast()+record.get(n-2));
                    break;
                case "D":
                record.addLast(record.getLast()*2);
                break;
                case "C":
                record.removeLast();
                break;
                default:
                record.addLast(Integer.parseInt(op));

            }

        }
        int total = record.stream().mapToInt(Integer::intValue).sum();
        return total;
        

    }}