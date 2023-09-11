package mathsAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

class BasicMaths {

    public void primeOrNOt(int n){
        int count = 0;
        for(int i = 1 ; i * i <= n ; i++){
            // The below number is to check there exists only two factors for the number
            if(n % i == 0){
                count++;
                if( n / i != i){
                    count++;
                }
            }
        }
        System.out.println(count == 2 ? "Given number is a Prime Number" : "Given number is not a prime number");
    }
    public void printAllDivisorsAlternativeMethod(int n){
        // It takes order of O(sqrt(n))
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i * i <= n ; i++){
            if(n % i == 0){
                list.add(i);
                if(n / i != i){
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        for(int e : list){
            System.out.print(e+" ");
        }
    }

    public void printAllDivisors(int n){
        System.out.printf("The divisors of %d : ",n);
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
    public void extractionOfNumberFromLast(int n){
        // We can use Math.log10(n) where it return something double add
        // with one and typecast to int , then return the length of the number
        while(n > 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n /= 10;
        }
    }
    // 2 * 2 * 2
    // 8 * 8 * 8
    public void power(int n , int pow){
        int sum = n;
        for(int i = 1 ; i < pow ; i++){
            sum = (sum * n);
        }
        System.out.println(sum);
    }

    // GCD using Euclidean Algorith
    // gcd(a,b) = gcd(a-b , b) , when a > b
    public void gcdEuclidean(int a , int b){
        while( a != 0 && b != 0 ){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        if(a == 0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
    public void gcdEquivalateral(int a , int b){
        while( a != 0 && b != 0 ){
            if(a > b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        if(a == 0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
