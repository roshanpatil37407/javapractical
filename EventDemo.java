import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements ActionListener, WindowListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public EventDemo() {
        setTitle("Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("No events yet.");
        textField = new JTextField(15);
        button = new JButton("Click Me");

        button.addActionListener(this);
        textField.addActionListener(this);
        addWindowListener(this);

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button clicked.");
        } else if (e.getSource() == textField) {
            label.setText("Text entered: " + textField.getText());
        }
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }

    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.setVisible(true);
    }
}
