package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI rate of interest is : "+ s.getRateOfInterest());
        System.out.println("ICICI rate of interest is : "+ i.getRateOfInterest());
        System.out.println("Axis rate of interest is : "+ a.getRateOfInterest());
    }
}
