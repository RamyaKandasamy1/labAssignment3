package labAssignment3;



import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RectangleArea {
	
	double length;
	double width;
	double area;
	String s;
	static int count=0;
	

   public double RectangleArea() {
	   JFrame frame=new JFrame();
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	   double length1=Double.parseDouble(JOptionPane.showInputDialog(frame,"Enter the length of the Rectangle : ","Input",JOptionPane.PLAIN_MESSAGE));
		double width1=Double.parseDouble(JOptionPane.showInputDialog(frame,"Enter the width of the Rectangle : ","Input",JOptionPane.PLAIN_MESSAGE));
	   
	   this.length=length1;
		this.width=width1;
		this.area= length1*width1;
		count ++;
		return area;
		
		
	}
 
   
   public void print() {
	   ImageIcon i = new ImageIcon("Rectangle.png");
	  // JOptionPane.showMessageDialog(null,"Length of the Rectangle : "+ this.length+"\nWidth of the Rectangle :" +this.width+"\n Area of the Rectangle  "+this.count+" :"+this.area);
	   //JFrame frame = new JFrame("JOptionPane showMessageDialog example");
	   JOptionPane.showMessageDialog(null,
			   "Length of the Rectangle : "+ this.length+"\nWidth of the Rectangle :" +this.width+"\n Area of the Rectangle  "+this.count+" :"+this.area ,
			   "Result ",
			   JOptionPane.INFORMATION_MESSAGE,
			   i);
	   
	   
	   
	   System.out.println("Length of the Rectangle :"+this.length+"\n");
		System.out.println("width of the Rectangle :"+this.width+"\n");
		System.out.println("Area of the Rectangle"+this.count+" :"+this.area+"\n");
		s=JOptionPane.showInputDialog("Do you want to continue finding another Area:(Y/N) :");
		System.out.println("You have entered :"+s);
		if((s.equals("Y") )|| (s.equals("y"))) {
			System.out.println("You :"+this.s);
		this.RectangleArea();
		this.print();
		}
		else if((s.equals("N") )|| (s.equals("n"))) {
			
			JOptionPane.showMessageDialog(null,"Thank You!! \n"+"We have calculated   "+this.count+" Area of the Rectangle using this program");
			System.out.println("Thank You!! \n"+"We have calculated   "+this.count+" Area of the Rectangle using this program");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "OOPS!! :You have entered wrong input"+s);
			System.out.println( "OOPS!! :You have entered wrong input");
			System.exit(0);
		
		}
   }



	   
  }

