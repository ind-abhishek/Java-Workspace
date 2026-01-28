public class EnhanchedForLoop {
    public static void main(String[] args) {
        // 1d array
        // int arr[] = { 12, 23, 44, 56, 78
        // };

        // for(int a : arr){
        //     System.out.print(a + " ");
        // }

        // 2d array
        // int marks[][]={
        //     {12,32,33},
        //     {22,32,44},
        //     {33,33,55}
        // };

        // for( int b[] : marks){
        //     for( int c : b){
        //         System.out.print(c + "  ");
        //     }
        //     System.out.println("");
        // }

        //jagged array
        int marks[][]={
            {12,32,33},
            {22},
            {33, 55}
        };

        for( int b[] : marks){
            for( int c : b){
                System.out.print(c + "  ");
            }
            System.out.println("");
        }
        
    }
}
