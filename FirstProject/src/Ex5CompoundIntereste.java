public class Ex5CompoundIntereste {
    public static void main(String[] args) {
        // Compound interest calculator
        // I am tired of typing scanner so I will just be assigning the variables
        // A = P * (1 + r/n)^n*t

        double principal = 100;
        double rate = 0.05; 
        int timesCompoundedPerYear = 3;
        int years = 10;

        double amount = principal * Math.pow(1 + rate/timesCompoundedPerYear, timesCompoundedPerYear * years);

        System.out.printf("Your final amount for compounded interest is $%f", amount);
    } 
}
