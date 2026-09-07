class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer> counter = new HashMap<>();
        for(int student: students){
            counter.merge(student,1,Integer::sum);
        }
        for(int sandwich:sandwiches){
            if(counter.getOrDefault(sandwich,0) > 0 ){
                counter.put(sandwich , counter.getOrDefault(sandwich,0)-1);
            }else{
                break;
            }
        }
        return counter.values().stream().mapToInt(Integer::intValue).sum();
    }
}