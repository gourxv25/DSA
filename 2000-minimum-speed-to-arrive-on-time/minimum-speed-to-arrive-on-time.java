class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int l = 1, r = 10_000_000;
        if(dist.length - 1 >= hour) return -1;
        while(l <= r){
            int mid = l + (r - l)/2;

            if(isValid(dist, mid, hour)) r = mid - 1;
            else l = mid+1;
        }
        return l;
        
    }

    private boolean isValid(int[] dist, double speed, double hour){
        double time = 0.0;

        for(int i = 0; i < dist.length ; i++){
            double t = (double) dist[i]/speed;

            if(i != dist.length- 1)
                time += Math.ceil(t);

            else time += t;

            if(time > hour) return false;
        }
        return true;
    }
 }