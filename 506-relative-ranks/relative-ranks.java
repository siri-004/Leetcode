class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        int rank=1;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            map.put(curr,rank);
            rank++;
        }
        String[] result=new String[score.length];
        for(int i=0;i<score.length;i++){
            int r=map.get(score[i]);
            if(r==1){
                result[i]="Gold Medal";
            }
            else if(r==2){
                result[i]="Silver Medal";
            }
            else if(r==3){
                result[i]="Bronze Medal";
            }
            else{
                result[i]=String.valueOf(r);
            }
        }
        return result;
    }
}