package openjava.oop.classes.abstraction;

public class AbstractClassAndMethod{
//Atm bank=new Atm();
public static void main(String[] args) {
   Hdfc hdfc=new Hdfc(2000,"aram-gar","Hdfc aram-gar");
   Hdfc hdfc1=new Hdfc();
   hdfc1.voiceAssistant();

}
}
abstract class Atm{
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

    static  void  atmCapacity(){
        System.out.println("atmCapacity is 10,00,000");
    }
    final void atmMessage(){
        System.out.println("Thank You. Visit Again");
    }
    abstract void voiceAssistant();
void greeting(){System.out.println("Welcome to ATM");}

}
class Hdfc extends Atm{


    public Hdfc(int atmNumber, String atmAddress, String atmClient) {
        super(atmNumber, atmAddress, atmClient);
    }

    public Hdfc() {
    }

    @Override
    void voiceAssistant() {
        System.out.println("Welcome to Hdfc");

    }
    Hdfc hdfc=new Hdfc(5000,"bhavani colony","Hdfc Aram-gar");
}

