class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer> counter = new HashMap<>();
        
        for( int student: students){
            counter.merge(student,1,Integer::sum);
        }
        for(var sandwich: sandwiches){
            if(counter.get(sandwich) > 0){
                counter.merge(sandwich,-1,Integer::sum);
            }else{
                break;
            }
        }

        return counter.values().stream().mapToInt(Integer::intValue).sum();

    }
}