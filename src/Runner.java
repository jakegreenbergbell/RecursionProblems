public class Runner {

    public int triangle(int rows) {
        if(rows == 0){
            return 0;
        }
        return rows + triangle(rows-1);
    }

    public int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    public int sumDigits(int n) {
        if(n/10 == 0){
            return n;
        }
        return n%10 + sumDigits(n/10);
    }

    public int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public int countPairs(String str) {
        if(str.length() < 3){
            return 0;
        }
        if(str.substring(0,1).equals(str.substring(2,3))){
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

    public int count11(String str) {
        if(str.length() < 2){
            return 0;
        }
        if(str.substring(0,2).equals("11")){
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public int countHi2(String str) {
        if(str.length() <= 1){
            return 0;
        }
        if(str.substring(0,2).equals("xx")){
            return countHi2(str.substring(3));
        }
        if(str.substring(0,1).equals("x")){
            return countHi2(str.substring(2));
        }
        if(str.substring(0,2).equals("hi")){
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

}