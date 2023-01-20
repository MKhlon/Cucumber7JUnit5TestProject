package cucumbercourse;

public class BillCalculationHelper {

    public static double calculateBillForCustomer(int initialBillAmount, double taxRate) {
        return initialBillAmount + (initialBillAmount*taxRate)/100;
    }
}
