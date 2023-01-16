class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map=new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        Queue<String> q=new PriorityQueue<>((w1,w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1)-map.get(w2));

        for(String w: map.keySet()){
            q.add(w);
            if(q.size()>k)
                q.poll();
        }

        List<String> ans=new ArrayList<>();
        while(!q.isEmpty())
            ans.add(q.poll());
        
        Collections.reverse(ans);
        return ans;
    }
}
