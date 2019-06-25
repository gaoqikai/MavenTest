public class yes {//a template
    private String answer;//contents
    private int result;

    public yes(String answer) {
        this.answer = answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void add(int toAdd) {
        result += toAdd;
    }

    public void minus(int toMin) {
        result -= toMin;
    }
    public int getResult(){
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
