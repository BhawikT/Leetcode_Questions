class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int R = mat.length;
        int C = mat[0].length;
        int r1=0;
        int c1=0;
        if(r*c!=R*C){
            return mat;
        }
        else{
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    ans[r1][c1]=mat[i][j];
                    c1++;

                    if(c1 == c){
                        c1= 0;
                        r1++;
                    }
                }
            }
        }
        return ans;
    }
}