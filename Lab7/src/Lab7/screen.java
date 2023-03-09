package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class screen extends JFrame implements ActionListener, MouseListener{
	JFrame Frame;
	JLabel Label, Label2, Label3, Label4;
	JButton Button, Button2, Button3;
	JToggleButton Toggle;
	JTextField Text;
	JPanel Panel, Panel2, Panel3, Panel4;
	JRadioButton Radio;
	
	public void GUI() {
		//defining frame
		Frame = new JFrame("Program")	;
		Frame.setSize(900, 600);
		
		Frame.setLayout(new GridLayout());
		
		//defining labels
		Label = new JLabel();
		Label2 = new JLabel();
		Label3 = new JLabel();
		Label4= new JLabel("The Mouse Goes here");		
		
		//defining buttons
		Button = new JButton("Button 1");
		Button2 = new JButton("Button 2");
		Button3 = new JButton("Button 3");
		Toggle = new JToggleButton("I toggle");
		Radio = new JRadioButton("I am a Radio Button");
		
		//defining text field
		Text = new JTextField();
		
		//define button Panel
		Panel = new JPanel();
		Panel.setLayout(new FlowLayout());
		Panel.add(Button);
		Button.setToolTipText("This is Button");
		Panel.add(Button2);
		Button2.setToolTipText("This is Button2");
		Panel.add(Button3);
		Button3.setToolTipText("This is Button3");
		
		//setting up panel 2
		Panel2 = new JPanel();
		Panel2.setLayout(new FlowLayout());
		Panel2.add(Toggle);
		Toggle.setToolTipText("This is ToggleButton");
		Panel2.add(Radio);
		Radio.setToolTipText("I am a radio button");
		Panel2.add(Label);
		Label.setText("I am a label");
		
		//setting up panel 3
		Panel3 = new JPanel();
		Panel3.setLayout(new FlowLayout());
		Panel.add(Text);
		Text.setText("Name");
		
		//panel 4 setup
		Panel4 = new JPanel();
		Panel4.add(Label4);
		Panel4.setBackground(Color.blue);
		
		//adding listeners
		Button.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Toggle.addActionListener(this);
		Radio.addActionListener(this);
		Panel4.addMouseListener(this);
		Text.addActionListener(this);
		
		
		//frame setup
		
		Frame.add(Panel);
		Frame.add(Panel2);
		Frame.add(Panel3);
		Frame.add(Panel4);
		Frame.setVisible(true);
		
		}
	
	@Override
	
	//action controller
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Button)
		{
			JOptionPane.showMessageDialog(this, "You Pressed the Button");
		}
		else if(e.getSource()==Button2)
		{
			JOptionPane.showMessageDialog(this, "You Pressed the Button2");
		}
		else if(e.getSource()==Button3)
		{
			JOptionPane.showMessageDialog(this, "You Pressed the Button3");
		}
		else if(e.getSource()==Toggle)
		{
			JOptionPane.showMessageDialog(this, "You Pressed the Toggle");
		}
		else if(e.getSource()==Radio)
		{
			JOptionPane.showMessageDialog(this, "You pressed radio");
		}
		else if(e.getSource()==Text)
		{
			String input = Text.getText();
			JOptionPane.showMessageDialog(this, "You entered:" + input);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//not used
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			JOptionPane.showMessageDialog(this, "You pressed The Left button");
		}
		else if(e.getButton()==MouseEvent.BUTTON3) {
			JOptionPane.showMessageDialog(this, "You pressed The Right Button");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==Panel4) {
			Label4.setText("The Mouse has Entered");
			Panel4.setBackground(Color.RED);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==Panel4) {
			Label4.setText("The Mouse has left");
			Panel4.setBackground(Color.BLUE);
		}
		
		
	}

}
