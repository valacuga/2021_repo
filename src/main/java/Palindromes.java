public class Palindromes {
    public static int palindromeChainLength (long n) {
        int i = 0;
        long pal;
        while(true){
            pal = Pal(n);
            if (pal == n)
                break;
            n += pal;
            i++;
        }
        System.out.println(i);
        return i;
    }

    public static long Pal(long n){
        long answer = 0;
        while(n != 0){
            answer = answer*10 + n%10;
            n /= 10;
        }
        return answer;
    }

}