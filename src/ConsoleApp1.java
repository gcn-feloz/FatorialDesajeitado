import java.util.*;

public class ConsoleApp1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 0;
        int tmp = 0;
        Boolean umaVez = true;

        System.out.print(n);

        while (n > 1) {
            
            if (n < 1) break;
                if(umaVez == true) {
                cnt = n;
                
                } else cnt = -n;
            n--;
            if (n < 1) break;
            cnt *= n;
            n--;
            if (n < 1) break;
            cnt /= n;
            n--;
            if (n < 1) break;
            cnt += n;
            n--;
            
            if(umaVez == true) {
                tmp = cnt;
                umaVez = false;
                } else tmp = tmp + cnt;
            cnt = 0;
        
        
            }
            System.out.print("Resultado:");

            System.out.println(tmp+cnt);
        
        
        }
        
        
    }