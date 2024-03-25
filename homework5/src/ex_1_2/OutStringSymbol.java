package ex_1_2;

public class OutStringSymbol {
    private String string;
    public char[] strToArray;

    public OutStringSymbol(String string) {
        this.string = string;
        this.strToArray = string.toCharArray();
    }

    public void outStringSymbol(){
        for(int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + ";");
        }
    }
}
