public class Patterns {
public static void main(String[] args) {
    int n = 4;
    // ****
    // ****
    // ****
    // ****
    // for(int i = 1; i<=4; i++){
    //     for(int j = 1; j<=i; j++ ){
    //     System.out.print("*");
    //     }
    //     System.out.println();
    // }  
    // pattern
    // *
    // **
    // ***
    // ****
    // for(int i = n; i>=1; i--){
    //     for(int j = 1; j<=i; j++ ){
    //     System.out.print("*");
    //     }
    //     System.out.println();
    // }  
    // for(int i = 1; i<=n; i++){
    //     // inner loop -> space print
    //     for(int j=1; j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     // inner loop -> star print
    //     for(int j=1; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


// Upper Half
    for(int i=1; i<=n;i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.println(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.println("*");
        }
        System.out.println();
    }
    // lower Half
    for(int i=n; i<=1;i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.println(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.println("*");
        }
        System.out.println();
    }
}
}
