import java.awt.event.*;
import javax.swing.*;
import java.awt.*; 
public class Window extends JFrame implements ActionListener{
    private Container pane;
    private JLabel lab;
    private JTextField t;
    private Container buttons;
    private Container text;

    //01GUICtoF
    private JButton ToCelsius;
    private JButton ToFarenheit;
   
    public Window(){
	this.setTitle("Celsius-Farenheit conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane=this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	lab= new JLabel("Convert Celsius to Farenheit!", null, JLabel.CENTER);
	t= new JTextField(8);
	ToFarenheit= new JButton("Celsius to Farenheit!");
	ToCelsius= new JButton("Farenheit to Celsius!");
	
	ToFarenheit.setActionCommand("convert");
		ToFarenheit.addActionListener(this);
	
		ToCelsius.addActionListener(this);

		buttons = new Container();
		buttons.setLayout(new FlowLayout());
		buttons.add(ToFarenheit);
		buttons.add(ToCelsius);

		text = new Container();
		text.setLayout(new FlowLayout());
		text.add(lab);
		text.add(t);
		pane.add(lab);
		pane.add(text);
		pane.add(buttons);
		pane.add(t);
		
		
	}

	public void actionPerformed(ActionEvent a) throws NumberFormatException{
	    double d;
	    String CF= a.getActionCommand();
	    try{if(CF.equals("convert")){
		String s= t.getText();
		Double x=Double.parseDouble(s);
		String Converted=""+((x*1.8)+32);
		t.setText(Converted);}
	    else{
		Double x=Double.parseDouble(t.getText());
		t.setText(""+((x-32)*0.5555));}
	    }
	    catch(NumberFormatException except){System.out.println("Enter A number please!");}
}
	   



    
	public static void main(String[] args){
	    Window w= new Window();
	    w.setVisible(true);}

}


