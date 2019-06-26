public class calculator {//a simple calculator
    private int result;//the counter

    public void add(int toAdd) {//add to counter
        result += toAdd;
    }

    public void minus(int toMin) {//deduct from counter
        result -= toMin;
    }

    public int getResult(){//get the counter value
        return result;
    }

    public void setResult(int result) {//reset the counter value
        this.result = result;
    }
}
