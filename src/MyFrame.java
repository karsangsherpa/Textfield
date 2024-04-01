import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
MyFrame() {
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Submit");
    button.addActionListener(this);

    textField = new JTextField();
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("consolas", Font.PLAIN, 35));
    textField.setForeground(Color.green);
    textField.setBackground(Color.BLACK);
    textField.setCaretColor(Color.red);
    textField.setText("Hello");
    

    this.pack();
    this.add(textField);
    this.add(button);

    this.setVisible(true);
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button) {
           System.out.println("Welcome " + textField.getText());
           button.setEnabled(false);
           textField.setEditable(false);
           
        }
    }

}
