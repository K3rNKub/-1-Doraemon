import javax.swing.JOptionPane;
public class showinputdialog {
   public static void main(String[] args){
    String data = JOptionPane.showInputDialog(null,"What is your name?");
    JOptionPane.showMessageDialog (null,"Your name is"+data);
   } 
}
