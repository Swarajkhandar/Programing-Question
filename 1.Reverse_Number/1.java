class Solution {
    public int reverse(int x) {
        int t=0,k=0;
        int m=0;
        if(x>0){
            while(x!=0){
                t=x%10;
                k=k*10+t;
                if((k-t)/10!=m)
                    return 0;
                m=k;
                x=x/10;
            }
        
            return k;
        }
        else if(x<0){
             while(x!=0){
                t=x%10;
                k=k*10+t;
                 if((k-t)/10!=m)
                    return 0;
                m=k;
                x=x/10;
                // System.out.println("df");
            }
            return k;
            
        }
        
    return x;
    }
