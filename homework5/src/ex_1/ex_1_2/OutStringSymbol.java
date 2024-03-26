package ex_1.ex_1_2;

public class OutStringSymbol {
    private String string;
    public char[] strToArray;

    public OutStringSymbol(String string) {
        this.string = string;
        this.strToArray = string.toCharArray();
    }

    public void outStringSymbol(){
        for (char c : strToArray) {
            System.out.print(c + ";");
        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
