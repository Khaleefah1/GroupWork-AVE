package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiTest {

		public static void Frame() {
			
			
			//GUI is practically finished, we just have to add the "Finish" button
			//the "Finish" button will be the one responsible for printing the result
			
			//what we have to do now is add the information added by the user to the list of the items...
			//... and transport the classes from our assignment to this GUI, implementing everything
			
			//i used this arraylist just to check if the information provided by the user could be added to this
			ArrayList myList = new ArrayList();
			
			JFrame myFrame = new JFrame("Group Project BeD");
			myFrame.setSize(700,700);
			
			//default info for the frame to exit when closed
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			JPanel panel0 = new JPanel();
			panel0.setLayout(null);
			
			
			JLabel labelshape = new JLabel("Please click on the item shape", JLabel.LEFT);
			labelshape.setBackground(Color.black);
			labelshape.setBounds(250,20,200,30);
			
			//adding the buttons for the user to add the items with the following shapes
			JButton cylinderbtn = new JButton("Cylinder");
			cylinderbtn.setBounds(200,50,90,30);
			
			JButton cubebtn = new JButton("Cube");
			cubebtn.setBounds(300,50,90,30);
			
			JButton pentagonbtn = new JButton("Pentagon");
			pentagonbtn.setBounds(400,50,90,30);
			
			
			cylinderbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//disposing the last frame for the user to have only one frame to use
					myFrame.dispose();
					
					//creating the new frame for the user to insert the information
					JFrame framecyl = new JFrame("Cylinder Information");
					framecyl.setSize(700,700);
					
					JPanel panelcyl = new JPanel();
					panelcyl.setLayout(null);
					JLabel info = new JLabel("Information of the item",JLabel.LEFT);
					info.setBounds(250,10,300,30);
					
					//textfields and labels for the user to insert the information of the item
					JLabel lbquantity = new JLabel("Quantity",JLabel.CENTER);
					lbquantity.setBounds(20,90,90,30);
					JTextField quantity = new JTextField();
					quantity.setBounds(130,90,60,30);
					
					JLabel lbradius = new JLabel("Radius in m",JLabel.CENTER);
					lbradius.setBounds(20,130,90,30);
					JTextField radius = new JTextField();
					radius.setBounds(130,130,60,30);
					
					JLabel lbheight = new JLabel("Height in m",JLabel.CENTER);
					lbheight.setBounds(20,170,90,30);
					JTextField height = new JTextField();
					height.setBounds(130,170,60,30);
					
					JLabel lbweight = new JLabel("Weight in kg",JLabel.CENTER);
					lbweight.setBounds(20,210,90,30);
					JTextField weight = new JTextField();
					weight.setBounds(130,210,60,30);
					
					//button for user to go back in case he does not want to add this item
					//this will not save any of the information and will make the user go back to the home frame
					JButton gobackbtn = new JButton("Go Back");
					gobackbtn.setBounds(300,300,90,30);
					
					gobackbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//this will dispose the current frame and will execute the frame again
							//the 'Frame()' code can be changed, I added here to help visualize the GUI without having the extra codes
							framecyl.dispose();
								Frame();
							}
						});
					
					//button for user to add the item to the list
					JButton additembtn = new JButton("Add Item to List");
					additembtn.setBounds(200,400,170,30);
					
					//adding all the information to the panel
					panelcyl.add(info);
					panelcyl.add(quantity); panelcyl.add(lbquantity);
					panelcyl.add(lbradius);panelcyl.add(radius);
					panelcyl.add(lbheight);panelcyl.add(height);
					panelcyl.add(lbweight);panelcyl.add(weight);
					panelcyl.add(gobackbtn);
					panelcyl.add(additembtn);
					
					//adding the panel to the frame and making everything visible
					framecyl.add(panelcyl);
					framecyl.setVisible(true);
					
					//the other buttons have the same logic
					
				}
			});
			
			cubebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myFrame.dispose();
					JFrame framecube = new JFrame("Cube Information");
					framecube.setSize(700,700);
					
					JPanel panelcube = new JPanel();
					panelcube.setLayout(null);
					JLabel info = new JLabel("Information of the item",JLabel.LEFT);
					info.setBounds(250,10,300,30);
					
					JLabel lbquantity = new JLabel("Quantity",JLabel.CENTER);
					lbquantity.setBounds(20,90,90,30);
					JTextField quantity = new JTextField();
					quantity.setBounds(130,90,60,30);
					
					JLabel lblength = new JLabel("Length in m",JLabel.CENTER);
					lblength.setBounds(20,130,90,30);
					JTextField length = new JTextField();
					length.setBounds(130,130,60,30);
					
					JLabel lbheight = new JLabel("Height in m",JLabel.CENTER);
					lbheight.setBounds(20,170,90,30);
					JTextField height = new JTextField();
					height.setBounds(130,170,60,30);
					
					JLabel lbwidth = new JLabel("Width in m",JLabel.CENTER);
					lbwidth.setBounds(20,210,90,30);
					JTextField width = new JTextField();
					width.setBounds(130,210,60,30);
					
					JLabel lbweight = new JLabel("Weight in kg",JLabel.CENTER);
					lbweight.setBounds(20,250,90,30);
					JTextField weight = new JTextField();
					weight.setBounds(130,250,60,30);
					
					//button for user to go back in case he does not want to add this item
					JButton gobackbtn = new JButton("Go Back");
					gobackbtn.setBounds(300,300,90,30);
							
					gobackbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							framecube.dispose();
								Frame();
							}
						});
					
					//button for user to add the item to the list
					JButton additembtn = new JButton("Add Item to List");
					additembtn.setBounds(200,400,170,30);
					
					panelcube.add(info);
					panelcube.add(quantity); panelcube.add(lbquantity);
					panelcube.add(lblength);panelcube.add(length);
					panelcube.add(lbheight);panelcube.add(height);
					panelcube.add(lbwidth);panelcube.add(width);
					panelcube.add(lbweight);panelcube.add(weight);
					panelcube.add(gobackbtn);
					panelcube.add(additembtn);
					
					framecube.add(panelcube);
					framecube.setVisible(true);
					
				}
			});
			
			pentagonbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myFrame.dispose();
					JFrame framepent = new JFrame("Pentagon Information");
					framepent.setSize(700,700);
					
					JPanel panelpent = new JPanel();
					panelpent.setLayout(null);
					JLabel info = new JLabel("Information of the item",JLabel.LEFT);
					info.setBounds(250,10,300,30);
					
					JLabel lbquantity = new JLabel("Quantity",JLabel.CENTER);
					lbquantity.setBounds(20,90,90,30);
					JTextField quantity = new JTextField();
					quantity.setBounds(130,90,60,30);
					
					JLabel lbheight = new JLabel("Height in m",JLabel.CENTER);
					lbheight.setBounds(20,130,90,30);
					JTextField height = new JTextField();
					height.setBounds(130,130,60,30);
					
					JLabel lbapoth = new JLabel("Apothem in m",JLabel.CENTER);
					lbapoth.setBounds(20,170,90,30);
					JTextField apoth = new JTextField();
					apoth.setBounds(130,170,60,30);
					
					JLabel lbbase = new JLabel("Base in m",JLabel.CENTER);
					lbbase.setBounds(20,210,90,30);
					JTextField base = new JTextField();
					base.setBounds(130,210,60,30);
					
					JLabel lbweight = new JLabel("Weight in kg",JLabel.CENTER);
					lbweight.setBounds(20,250,90,30);
					JTextField weight = new JTextField();
					weight.setBounds(130,250,60,30);
					
					//button for user to go back in case he does not want to add this item
					JButton gobackbtn = new JButton("Go Back");
					gobackbtn.setBounds(300,300,90,30);
							
					gobackbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							framepent.dispose();
								Frame();
							}
						});
					
					//button for user to add the item to the list
					JButton additembtn = new JButton("Add Item to List");
					additembtn.setBounds(200,400,170,30);
					
					additembtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//wrote only to see if it was possible to add to list
							myList.add(weight.getText());
							System.out.println(myList);
							//add in here the info in which will be added to the list
							
						}
					});
					
					panelpent.add(info);
					panelpent.add(quantity); panelpent.add(lbquantity);
					panelpent.add(lbheight);panelpent.add(height);
					panelpent.add(lbapoth);panelpent.add(apoth);
					panelpent.add(lbbase);panelpent.add(base);
					panelpent.add(lbweight);panelpent.add(weight);
					panelpent.add(gobackbtn);
					panelpent.add(additembtn);
					
					framepent.add(panelpent);
					framepent.setVisible(true);
					
				}
			});
			
			//adding the buttons to the panel and adding the panel to the main frame
			panel0.add(labelshape);
			panel0.add(cylinderbtn); panel0.add(cubebtn); panel0.add(pentagonbtn);
			myFrame.add(panel0);	
			
			//making the frame visible
			myFrame.setVisible(true);

		}
		public static void main(String[] args) {
			Frame();
			}
	}