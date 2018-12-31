class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i < numCourses; i++) adjList.add(new ArrayList<>());
        // edge[1] => edge[0]
        
        for(int[] edge : prerequisites){
            indegree[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++){
            if(indegree[i]==0) q.offer(i);
        }
        
        Set<Integer> visited = new HashSet<>(); // a모든 노드 방문여부 확인
        
        while(!q.isEmpty()){
            int node = q.poll();
            visited.add(node);   
            for(int dest : adjList.get(node)){
                if(--indegree[dest] == 0) q.offer(dest);
            }
            adjList.get(node).clear();
        }
        
        return visited.size() == numCourses;
        
    }
}
