class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> cach = new HashMap<>();
        return climb(n,cach);
            }
    public  int climb(int n ,Map<Integer,Integer> cache){
            if(n <= 2){
                return n;
            }
            if (cache.containsKey(n)){
                return cache.get(n);
            }else{
                int val  = climb(n-1,cache) + climb(n-2,cache);
                cache.put(n, val);

            }
            
            return cache.get(n);
            
        }



}
