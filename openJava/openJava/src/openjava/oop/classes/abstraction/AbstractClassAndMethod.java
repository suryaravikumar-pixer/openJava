package openjava.oop.classes.abstraction;

public class AbstractClassAndMethod {
//Atm bank=new Atm();

}

abstract class Atm {
    int atmNumber;
    String atmAddress;
    String atmClient;

    public Atm(int atmNumber, String atmAddress, String atmClient) {
        this.atmNumber = atmNumber;
        this.atmAddress = atmAddress;
        this.atmClient = atmClient;
    }

    public Atm() {
    }

    static void atmCapacity() {
        System.out.println("atmCapacity is 10,00,000");
    }

    final void atmMessage() {
        System.out.println("Thank You. Visit Again");
    }

    abstract void voiceAssistant();

    void greeting() {
        System.out.println("Welcome to ATM");
    }


}

class Hdfc extends Atm {
    boolean covid_free;

    public Hdfc(int atmNumber, String atmAddress, String atmClient, boolean covid_free) {
        super(atmNumber, atmAddress, atmClient);
        this.covid_free = covid_free;
    }
    public Hdfc() {
    }
    @Override
    void voiceAssistant() {
        System.out.println("Welcome to Hdfc");

    }
    public static void main(String[] args) {
//        Atm atm = new Atm();

        Hdfc hdfc = new Hdfc(2000,"aram-gar","Hdfc aram-gar",true);
        Hdfc hdfc1=new Hdfc();
        hdfc.voiceAssistant();

        EastWestBank eastWestBank = new EastWestBank();
        eastWestBank.voiceAssistant();

        BankOfBoroda bankOfBoroda = new BankOfBoroda();
        bankOfBoroda.voiceAssistant();

    }


}

class EastWestBank extends Atm{
    @Override
    void voiceAssistant() {
        System.out.println("Welcome East West Bank");
    }
}

class BankOfBoroda extends Atm{
    @Override
    void voiceAssistant() {
        System.out.println("Welcome BankOfBoroda ");
    }
}
