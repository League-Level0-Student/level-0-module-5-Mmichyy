package extra;

import javax.swing.JOptionPane;

public class SkillsPracticeworksheet{

public static void main(String[] args) {
//	
//	SkillPractice skills = new SkillPractice();
//    skills.skill1();
//    skills.skill2();
//    skills.skill3();
//    skills.skill4();
//    skills.skill5();
//
//    void skill1() {
String dimes= JOptionPane.showInputDialog("How many dimes do you have?");  

int number= Integer.parseInt(dimes);

JOptionPane.showMessageDialog(null, "you have" +(number*10)+"cents");


String tall= JOptionPane.showInputDialog("How tall are you in inches?");

int real= Integer.parseInt(tall);

if(real<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties wheatyy!!!!!");
}
else {
	JOptionPane.showMessageDialog(null, "STOP EATING YOU FATTY!!!!!!!");
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
