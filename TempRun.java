package pkg1;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class TempRun implements ActionListener {
	JFrame f;
	  JLabel l1,l2;
	  JButton b1;
	  JRadioButton rf,rc,rk;
	  ButtonGroup bg1;
    JTextField t1,t2;
	TempRun(){
		  f = new JFrame();
		  bg1=new ButtonGroup();
		  l1 = new JLabel("Select Unit of Measurement:");
	      l1.setBounds(50,50,200,50);
	      rf=new JRadioButton("Farenheit");
	      rc=new JRadioButton("Celcius");
	      rk=new JRadioButton("Kelvin");
	      rf.setBounds(50,80,100,50);
	      rc.setBounds(150,80,100,50);
	      rk.setBounds(250,80,100,50);
	      rf.setSelected(true);
	      
	      l2 = new JLabel("Enter Temperature:");
	      l2.setBounds(50,130,150,50);

	      t1=new JTextField();
	      t1.setBounds(200,130,100,50);
	      
	      b1=new JButton("Convert");
	      b1.setBounds(180,320,100,60);
	      
	      t2=new JTextField();
	      t2.setBounds(50,200,400,80);
	      t2.setVisible(false);

	      b1.addActionListener(this);

	      bg1.add(rf);
	      bg1.add(rc);
	      bg1.add(rk);
	      
	      f.add(l1);
	      f.add(l2);
	      f.add(b1);
	      f.add(rf);
	      f.add(rc);
	      f.add(rk);
	      f.add(t1);
	      f.add(t2);
	      
	      f.setTitle("Temperature conversion");
	      f.setSize(500,470);
		  f.setLayout(null);
		  f.setVisible(true);
	      
	}
	public void actionPerformed(ActionEvent e) {
		char symb='F';
		double temp;
		if (rf.isSelected()) { 
			  symb = 'F'; 
        }else if (rc.isSelected()) { 
			  symb = 'C'; 
        }else if (rk.isSelected()) { 
			  symb = 'K'; 
        }
		temp=Double.parseDouble(t1.getText());
		t2.setText(convert(temp,symb));
		t2.setVisible(true);
	}

	public String convert(double t, char s){
		if(s=='F') {
			return "\n Celcius: "+FarenheitToCelcius(t)+"°C     Kelvin: "+FarenheitToKelvin(t)+"K";
		}else if(s=='C') {
			return "\n Farenheit: "+CelciusToFarenheit(t)+"°F     Kelvin: "+CelciusToKelvin(t)+"K";
		}else if(s=='K') {
			return "\n Farenheit: "+KelvinToFarenheit(t)+"°F     Celcius: "+KelvinToCelcius(t)+"°C";
		}
		return null;
	}
	public double FarenheitToCelcius(double f) {
		return (f-32)/1.8;
	}public double CelciusToFarenheit(double c) {
		return 1.8*c+32;
	}public double FarenheitToKelvin(double f) {
		return (f-32)/1.8+273.15;
	}public double KelvinToFarenheit(double k) {
		return (k-273.15)*1.8+32;
	}public double CelciusToKelvin(double c) {
		return c+273.15;
	}public double KelvinToCelcius(double k) {
		return k-273.15;
	}
	
	public static void main(String arg[]) {
		new TempRun();
	}
}
