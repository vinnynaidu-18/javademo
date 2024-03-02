package InterfaceLatest;

public class SBIBankLoginProcess implements BankLoginService {


    SBIBankService sbiBankService;

    public SBIBankLoginProcess() {
        this.sbiBankService = new SBIBankService();

    }
    public SBIBankLoginProcess(SBIBankService sbiBankService) {
        this.sbiBankService =sbiBankService;

    }
        @Override
        public boolean login (String userName, String password){
            if (sbiBankService.login(userName, password)) {
                String otp = sbiBankService.generateOTP(userName);
                boolean validOtp = sbiBankService.validateOTP(otp);
                if (validOtp) {
                    System.out.println("Valid otp & login successful");

                } else {
                    System.out.println("Invalid otp & login failed");
                }

                return validOtp;
            } else {
                System.out.println("Invalid Credentials");
                return false;
            }
        }

    }


