class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer>  counter = new HashMap<>();
        for(int student:students){
            counter.merge(student, 1, Integer::sum);
        }
        for(int sandwich :sandwiches){
            if (counter.getOrDefault(sandwich,0) > 0){
                int val =counter.get(sandwich);
                val -= 1;
                counter.put(sandwich, val);
            }else{
                break;
            }
        }

        
            int total = counter.values().stream().mapToInt(Integer::intValue).sum();
            return total;
        
        

        
        
    }
}