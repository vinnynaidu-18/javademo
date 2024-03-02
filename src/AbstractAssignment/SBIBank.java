package AbstractAssignment;

    public class SBIBank extends RBIBank {
        int person1 =600;
        int person2 =700;
        int person3 =800;
        int person4 =900;

        int sbiTotalSendAmt = person1 + person2 + person3 + person4;

        public SBIBank(int sbiBalance, int hdfcBalance, int person1, int person2, int person3, int person) {
            super(sbiBalance, hdfcBalance);
            this.person1 = person1;
            this.person2 = person2;
            this.person3 = person3;
            this.person4 = person;
        }



        @Override
        public void sendAmount() {
            if (sbiBalance >= sbiTotalSendAmt) {

                System.out.println("Sbi sent Balance to Hdfc Bank:"+ "  "+sbiTotalSendAmt);
            } else {
                System.out.println("Not Transfered");
            }

        }


        @Override
        public String toString() {
            return "SBIBank{" +
                    "person1=" + person1 +
                    ", person2=" + person2 +
                    ", person3=" + person3 +
                    ", person=" + person4 +
                    ", sbiTotalSendAmt=" + sbiTotalSendAmt +
                    ", sbiBalance=" + sbiBalance +
                    ", hdfcBalance=" + hdfcBalance +
                    '}';
        }
    }

