class Solution {
    public void setZeroes(int[][] matrix) {
        int pos=0;
       int row[]=new int[matrix.length];
        int column[]=new int[matrix[0].length];
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix[0].length;y++){
                if(matrix[x][y]==0){
                    row[pos]=x+1;
                    column[pos]=y+1;
                    pos++;
                }
            }
        }

    for(int i=0;i<matrix.length;i++){
        if(row[i]==0){
i=i+matrix.length;
        }else if(row[i]!=0){
            for(int k=0;k<matrix.length;k++){
                int z=row[i]-1;
                matrix[z][k]=0;
            }
        }
    }

        

    for(int i=0;i<matrix.length;i++){
        if(column[i]==0){
i=i+matrix.length;
        }else if(column[i]!=0){
            for(int k=0;k<matrix.length;k++){
                int z=column[i]-1;
                matrix[k][z]=0;
            }
        }
    }

        
        
    }
}
