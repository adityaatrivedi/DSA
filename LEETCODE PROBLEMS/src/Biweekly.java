public class Biweekly {
    public static void main(String[] args) {
       long n = 1000 ;

        System.out.println(Tri((int) n));
        System.out.println(convertToBase36(Math.toIntExact(n)));

    }
    // Q1) Hexadecimal ..
    static String Tri (int n){
            int cube = n*n*n;
            int sq = n*n;
            StringBuilder hex = new StringBuilder();

            while (n > 0) {
                int remainder = n % 16;
                char hexChar;

                if (remainder < 10) {
                    hexChar = (char) ('0' + remainder);      // 0-9 → '0'-'9'
                } else {
                    hexChar = (char) ('A' + (remainder - 10)); // 10-15 → 'A'-'F'
                }

                hex.append(hexChar);
                sq = sq / 16;
            }
            return hex.reverse().toString();
    }
    public static String convertToBase36(int n) {
        if (n == 0) return "0";
        int cube = n*n*n;
        StringBuilder base36 = new StringBuilder();

        while (n > 0) {
            int remainder = cube % 36;
            char ch;

            if (remainder < 10) {
                ch = (char) ('0' + remainder);
            } else {
                ch = (char) ('A' + (remainder - 10));
            }

            base36.append(ch);
            cube /= 36;
        }

        return base36.reverse().toString();
    }

    public String concatHex36(int n) {
        return convert(n);
    }
    static String convert(int x){
        int xsquare=x*x;
        int xcube=x*x*x;
        String hexadecimal=Integer.toString(xsquare,16).toUpperCase();
        String hexatrigesimal=Integer.toString(xcube,36).toUpperCase();
        return hexadecimal + hexatrigesimal;
    }
}
