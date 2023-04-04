public class Main {
    public static void main(String[] args) {
        int max=50,min=1;
        for(int x=1;x<=max;x++){
            boolean isPrime=true;
            for(int divisor=2;divisor<x;divisor++){
                if(x%divisor==0)
                {isPrime=false;}
            }
            if(isPrime==true)
            {System.out.println(x);}

        }
    }
}

