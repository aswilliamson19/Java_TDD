public class Printer {

    private int paper;
    private int printNum;
    private int copiesNum;

    public Printer(int paper, int printNum, int copiesNum){
        this.paper = paper;
        this.printNum = printNum;
        this.copiesNum = copiesNum;
    }

    public int getPaper(){
        return this.paper;
    }

    public int copyNumber(){
        return this.printNum * this.copiesNum;
    }

    public boolean paperCheck(){
        if (this.paper > this.printNum){
            return true;
        } else {
            return false;
        }
    }
}
