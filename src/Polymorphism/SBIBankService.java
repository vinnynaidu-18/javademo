package Polymorphism;

public class SBIBankService extends RBIBankService {
    @Override
    public double calculateIntererst(int principalAmt) {
        double totalAmt = 0;
        double interestAmt = super.calculateIntererst(principalAmt);
        totalAmt = interestAmt + principalAmt;
        return totalAmt;
    }
       public double calculateInterest(int prinipalAmt,int days){
        double totalAmt=0;
        if (days>85){
    return this.calculateIntererst(prinipalAmt);
           }
           return totalAmt+prinipalAmt;
       }

}

