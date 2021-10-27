public class HigherLower{
    //declare vars
    private int randomNum;
    private String msg;
    //constructor
    public HigherLower(){
        randomNum=0;
        msg="";
    }
    //set
    public void setRandomNum(int randomNum){
        this.randomNum=randomNum;
    }
    //compute
    public void computeHigherLower(){
        if(randomNum>=10){
            msg="higher";
        }
        else{
            msg="lower";
        }
    }
    //get
    public String getMsg(){
        return msg;
    }
}