public class TwoDarray {
    public static void main(String[] args) {
        int sum = 0;
        
        int arr [][] = 
        {
            {13, 21},
            {22,1, 8},
            {7}
        };

        // int arr [][] = new int[3][];
        // arr[0][0] = 13;
        // arr[0][1] = 21;
        // arr[1][0] = 22;
        // arr[1][1] = 18;
        // arr[1][2] = 8;
        // arr[2][0] = 17;

        for(int i = 0; i < arr.length; i++){ 
            for(int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    }
                  }

}