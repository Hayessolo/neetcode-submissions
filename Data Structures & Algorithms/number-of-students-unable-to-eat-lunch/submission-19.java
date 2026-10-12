class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer> counter = new HashMap<>();
        for(int student : students){
            counter.merge(student, 1,Integer::sum);
        }
        for (int sandwich : sandwiches){
            int val = counter.getOrDefault(sandwich ,0);
            if(val >0){
                --val;
                counter.put(sandwich, val);
            }else{
                break;
            }
            

        }
        return counter.values().stream().mapToInt(Integer::intValue).sum();
        
        
    }
}