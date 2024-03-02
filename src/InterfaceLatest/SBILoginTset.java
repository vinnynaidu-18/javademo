package InterfaceLatest;

public class SBILoginTset {
    public static void main(String[] args) {
        BankLoginService loginService=new SBIBankService();
        boolean loginstatus= loginService.login("222","555");
        if(loginstatus){

        }
    }
}
