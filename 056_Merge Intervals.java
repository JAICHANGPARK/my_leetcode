/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1) return intervals;
        
        List<Interval> ret = new ArrayList<>();
        
        //1,2 4,5 2,4 우선 정렬이 필요하겠다.
        // 1,2 2,5
        
        Collections.sort(intervals, (a,b) -> a.start-b.start);
        
        //for문 하나로 2개 처리 
        for(int i = 1; i < intervals.size(); i++){
            Interval a = intervals.get(i -1);
            Interval b = intervals.get(i);
            
            if(a.end >= b.start && b.end >= a.start){
                b.start = Math.min(a.start, b.start);
                b.end = Math.max(a.end, b.end);
            }else{
                ret.add(a);
            }
        }
        
        ret.add(intervals.get(intervals.size() -1));
        
        return ret;
    }
}
