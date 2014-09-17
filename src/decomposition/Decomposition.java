/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decomposition;

import static java.lang.System.exit;

/**
 *
 * @author ubick
 */
public class Decomposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int first = Integer.parseInt(args[0]);
       int second = Integer.parseInt(args[1]);
       if(first>150){
           exit(1);
       }
       int result = decomposition(first, second);
       System.out.println(result);
        
    }
    
    public static int decomposition(int n, int k){
        if(n == k){ return 1;}
        if(n < k){ return 0;}
        if(k == 0){ return 0;}
        int S = 0;
        for(int i = 0; i<=k;i++){
            S = S + decomposition(n-k,i);
        }
        return S;
    }
    
    
}
