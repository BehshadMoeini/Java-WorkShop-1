public class Block extends Long_term_account{
    
    public void blocking(){
        super.balance = 0;
        super.codemeli = 0;
        super.password = 0;
        super.phoneNumber = 0;
        super.name = null;
        System.out.println("Your long-term Account has been blocked");
    }

}
