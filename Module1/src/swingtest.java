//// taken (and edited) from https://en.wikipedia.org/wiki/Swing_(Java)
//
//import java.awt.FlowLayout;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.SwingUtilities;
//
//public class SwingTest implements Runnable {
//
//    @Override
//    public void run() {
//        // Create the window
//        JFrame f = new JFrame("Hello, Everybody!");
//        // Sets the behavior for when the window is closed
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // Add a layout manager so that the button is not placed on top of the label
//        f.setLayout(new FlowLayout());
//        // Add a label and a button
//        f.add(new JLabel("Hello, world!"));
//        f.add(new JButton("Press me, I am a good button!"));
//        // Arrange the components inside the window
//        f.pack();
//        // By default, the window is not visible. Make it visible.
//        f.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingTest se = new SwingTest();
//        // Schedules the application to be run at the correct time in the event queue.
//        SwingUtilities.invokeLater(se);
//    }
//
//}

// in this second example extend the javax.swing.JFrame class and add our own widget(s) to it (in this case, a JButton).
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingTest extends JFrame {
    private final JButton b = new JButton();

    public SwingTest() {
        super();
        this.setTitle("HelloApp");
        this.getContentPane().setLayout(null);
        this.setBounds(100, 100, 180, 140);
        this.add(makeButton());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JButton makeButton() {
        b.setText("Click me!");
        b.setBounds(40, 40, 100, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(b, "Hello World!");
            }
        });
        return b;
    }

    public static void main(String[] args) {
        new SwingTest();
    }
}