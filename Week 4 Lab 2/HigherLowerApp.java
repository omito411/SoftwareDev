import javax.swing.JOptionPane;
public class HigherLowerApp{
    public static void main(String[] args){

    //declare vars
    int randomNum=(int)(Math.random() * 20);
    String msg;
    //declare & create objects
    HigherLower h1;
    h1=new HigherLower();
    //set
    h1.setRandomNum(randomNum);
    //compute
    h1.computeHigherLower();
    //get
    msg=h1.getMsg();
    //output
    JOptionPane.showMessageDialog(null, randomNum);
    JOptionPane.showMessageDialog(null, msg);

    }
    
}