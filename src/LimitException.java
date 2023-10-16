public class LimitException extends Exception{

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    private double remainingAmount;

}
