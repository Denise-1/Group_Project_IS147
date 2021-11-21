package GroupProjectIS147.Print;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JPanel mainPanel;
    private JTextField userNameText;
    private JLabel userNameLabel;
    private JTextField passwordText;
    private JButton enterButton;
    private JButton clearButton;

public LoginPage(){
    setContentPane(mainPanel);
    setTitle("Login Page");
    setSize(400, 500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    enterButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = userNameText.getText();
            String password = passwordText.getText();
        }
    });


}



}
