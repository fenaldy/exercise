package MainPackage;

import java.util.ArrayList;

public class primecounter {
	
	public static ArrayList<Integer> primeNumber(int numb) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		int input = numb;
        for(int i=2; i<input; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrima = false;
                    break;
                }
            }
            if(isPrima==true){
                ar1.add(i);
            }
            
        }

        return ar1;
	}
	
	public static void primeChecker(int primeChecker) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
        int counter=0;
   
        for (int i=2; i<=primeChecker; i++){
            if (primeChecker%i==0){
            	counter++;
            } 
        }
        
        if (counter==1){
        	int sumTemp=0;
    		primeList = primeNumber(primeChecker);
    		
        	for(int x=0; x<primeList.size(); x++) {
        		System.out.print(" "+primeList.get(x));
        		sumTemp += primeList.get(x);
        	}
        	System.out.println("\nSum of prime number list : "+sumTemp);
        }else {
            System.out.println(primeChecker+" bukan bilangan prima");
        }
	}

	public static void main(String []args) {
		primeChecker(5);
	}
}
