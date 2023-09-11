package patterns;

class PatternImplementation {

    public void pattern19(int n){
        int len = n * 2;
        int rowSpc = 0;
        for(int row = 0 ; row < n * 2 ; row++){
            rowSpc = (row < n) ? row : n - ((row + 1) - n);
            for(int col = 1 ; col <= len ; col++){
                System.out.print((col <= n - rowSpc || col > (n + rowSpc)) ? "*" : " ");
            }
            System.out.println();
        }
    }
    public void pattern20(int n){
        int len = n * 2 - 1;
        int rowSpc = 0;
        for(int row = 1 ; row < n * 2; row++){
            rowSpc = (row <= n) ? row : rowSpc - 1;
            for(int col = 0 ; col < n * 2 ; col++){
                System.out.print((col < rowSpc || col >= n * 2 - rowSpc) ? "*" : " ");
            }
            System.out.println();
        }
    }
    public void pattern21(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n ; col++){
                System.out.print(((row == 1 || row == n ) || (col == 1 || col == n)) ? "*" : " ");
            }
            System.out.println();
        }
    }
    public void pattern22(int n){
        // Pattern 22 -> It's a concentric Square pattern
        int val = n;
        int len = n * 2 - 1;
        int[][] arr = new int[len][len];
        int top = 0 , bottom = len - 1;
        int left = 0  ,right = len - 1;
        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ; i++){
                arr[top][i] = val;
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                arr[i][right] = val;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = val;
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--){
                    arr[i][left] = val;
                }
                left++;
            }
            val--;
        }
        for(int[] ar : arr){
            for(int e : ar){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}


