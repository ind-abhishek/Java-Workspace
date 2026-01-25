public class LoopsPractice {
    public static void main(String[] args) {
        int n = 19;
    //     for (int i = 1; i <= n; i++) {
            
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 || i == n || j == 1 || j == n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //I latter
        //     for (int i = 1; i <= n; i++) {
            
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || j == n/2) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println( );
        // }

            //E latter

        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j<= n; j++){
        //         if (i == 1 ||i == n/2 || i == n || j == 1 ) {
        //             System.out.print("*");
        //         }
        //         else{
        //         System.out.print(" ");}
        //     }
        //     System.out.println();
        // }

        // curved A latter
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n ; j++){
        //         if (i==1 && j > 1 && j < n/2 || j == 1 && i > 1 || i == n/2 && j < n/2 || j == n/2 && i > 1){
        //             System.out.print("*");
        //         }else{
        //         System.out.print(" ");}
        //     }
        //         System.out.println();

        // }

                // curved D latter
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n ; j++){
        //         if (j ==1 || i==1 && j < (n/2)-1 || i==n && j < (n/2)-1 || j == n/2 && i >1 &&  i < n){
        //             System.out.print("*");
        //         }else{
        //         System.out.print(" ");}
        //     }
        //         System.out.println();

        // }


            // curved c latter
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n ; j++){
        //         if (j ==1 && i > 1 && i < n|| i == 1 && j > 1 || i == n && j>1){
        //             System.out.print("*");
        //         }else{
        //         System.out.print(" ");}
        //     }
        //         System.out.println();

        // }

            // daignoal parteen
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n ; j++){
                if (i==j || i+j == n-1 || i+j == 5 || i-j ==5){
                    System.out.print("*");
                }else{
                System.out.print(" ");}
            }
                System.out.println();

        }
    
 
    }
}