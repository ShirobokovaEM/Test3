
package javaapplication39;
public class JavaApplication39 {
    
    public static void main(String[] args) {        
        int[] m = {1,1,2,1,1,1};
        System.out.println("Vse elements poslodovat ravni:" + elementPosledov(m));
    }

    private static boolean elementPosledov(int[] m) {
        for (int i = 0; i < m.length; i++) {
            if(m[0] != m[i]) return false;            
        }
        return true;
    }
    
}
