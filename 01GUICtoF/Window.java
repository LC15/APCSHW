import java.awt.event.*;
import javax.swing.*;
import java.awt.*; 
public class Window extends JFrame implements ActionListener{
    private Container pane;
    private JLabel title;
    private JTextField t;
    private Container buttons;
    private Container text;

    //01GUICtoF
    private JButton ToCelsius;
    private JButton ToFarenheit;
   
    public Window(){
	this.setTitle("Celsius to Farenheit");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane=this.getContentPane();

	title= new JLabel("Convert Celsius to Farenheit!");
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
		text.add(title);
		text.add(t);

		pane.add(text);
		pane.add(buttons);
		
	}

	public void actionPerformed(ActionEvent a) throws NumberFormatException{
	    double d;
	    String CF= a.getActionCommand();
	    if(CF.equals("convert")){
		String s= t.getText();
		Double x=Double.parseDouble(s);
		String Converted=""+((x-32)*0.5555);
		t.setText(Converted);}
	   
	}


    
	public static void main(String[] args){
	    Window w= new Window();
	    w.setVisible(true);}

}


