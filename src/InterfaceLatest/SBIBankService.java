package InterfaceLatest;

import java.util.UUID;

public class SBIBankService implements BankOTPValidService {
    String accountNumber = "1111";
    String password = "555";
    String otp;

    public SBIBankService() {

    }

    @Override
    public boolean login(String userName, String password) {
        if (userName.equals(accountNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {
        if (this.accountNumber.equals(accountNumber)) {
            return otp = UUID.randomUUID().toString();
        }
        return null;
    }


    @Override
    public boolean validateOTP(String otp) {
        if (this.otp.equals(otp)) {
            return true;
        }
        return false;
    }
}


