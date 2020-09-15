public class interest {

	
    public double calculate(int principle, int year, double interestRate, int terms) {
        
       double amount = principle *  Math.pow(1 + (interestRate / terms), terms * year);

        double cinterest = amount - principle;

        return cinterest;
    }
    
    
    public static void main(String args[]) {
        int principal = 500000;
        double rate = 0.035;
        int year= 10;
    	double sinterest = ((500000 * 3.5 * 10) / 100);
        interest obj = new interest();
        System.out.println("Simple interest on Taka. "+principal+" in "+year+" years = Taka."+String.format("%.2f",sinterest));
        System.out.println("Interest on Taka. "+principal+" in "+year+" years compounded annually = Taka. "+String.format("%.2f",obj.calculate(principal, year, rate, 1)));
        System.out.println("Interest on Taka. "+principal+" in "+year+" years compounded semi-annually = Taka. "+String.format("%.2f",obj.calculate(principal, year, rate, 2)));
        System.out.println("Interest on Taka. "+principal+" in "+year+" years compounded quarterly = Taka. "+String.format("%.2f",obj.calculate(principal, year, rate, 4)));
        System.out.println("Interest on Taka. "+principal+" in "+year+" compounded monthly = Taka. "+String.format("%.2f",obj.calculate(principal, year, rate, 12)));
        System.out.println("Interest on Taka. "+principal+" in "+year+" years compounded daily = Taka. "+String.format("%.2f",obj.calculate(principal, year, rate, 365)));
    }
}