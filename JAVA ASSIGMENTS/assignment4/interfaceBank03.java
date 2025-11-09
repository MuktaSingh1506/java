package assignment4;

interface Bank {
    public float getRateOfInterest();
}

class SBI implements Bank {
    private static final float rateOfInterest = 6f;
    @Override
    public float getRateOfInterest() {
        return rateOfInterest;
    }
}

class ICICI implements Bank {
    private static final float rateOfInterest = 6.2f;
    @Override
    public float getRateOfInterest() {
        return rateOfInterest;
    }
}

class AXIS implements Bank {
    private static final float rateOfInterest = 5.6f;
    @Override
    public float getRateOfInterest() {
        return rateOfInterest;
    }
}


public class interfaceBank03 {
    public static void main(String[] args) {
        ICICI acc1 = new ICICI();
        System.out.println(acc1.getRateOfInterest());

        AXIS acc2 = new AXIS();
        System.out.println(acc2.getRateOfInterest());

        SBI acc3 = new SBI();
        System.out.println(acc3.getRateOfInterest());
    }
}
