import java.awt.*;
public class awtexam extends Frame
{
  awtexam()
  {
      Button b=new Button("Click Here");
      b.setBounds(100,60,300,300);
      add(b);
      b.setSize(80,40);
      setTitle("AWT Example");
      setLayout(null);
      setVisible(true);

  }
  public static void main(String args[])
  {
    awtexam aw= new awtexam();
    }
}
