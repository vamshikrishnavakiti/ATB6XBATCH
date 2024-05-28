package EX_25052024_Exceptions;

public class bank {
    String curency;
    String amount;

    public bank(String curency, String amount) {
        this.curency = curency;
        this.amount = amount;
    }

    public String getCurency() {
        return curency;
    }

    public void setCurency(String curency) {
        this.curency = curency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String add(bank bankName) {
        try {
            if (!bankName.curency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency not matched");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String sum = this.amount + bankName.amount;
        return sum;

    }}