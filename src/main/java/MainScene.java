import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;

public class MainScene extends JPanel {
    private JTextField inputTextField;
    private JButton searchButton;

    private JLabel imageLabel1;
    private ImageIcon imageIcon1;

    private JLabel imageLabel2;
    private ImageIcon imageIcon2;

    private JButton filter1;
    private JButton filter2;
    private JButton filter3;
    private JButton filter4;
    private JButton filter5;

    public MainScene(){
        this.setSize(Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGHT);
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        //WebScrapping webScrapping = new WebScrapping("shaigivati");

        this.inputTextField = new JTextField();
        this.inputTextField.setBounds(Constants.WINDOW_WIDTH / 3 + 10, Constants.MERGE_FROM_TOP, Constants.WIDTH_BUTTON,Constants.HEIGHT_BUTTON);
        this.inputTextField.setBackground(Color.WHITE);
        this.inputTextField.setForeground(Color.BLACK);
        this.inputTextField.setToolTipText("Enter word to search:");
        this.add(this.inputTextField);

        this.searchButton = new JButton("Search");
        this.searchButton.setBounds(this.inputTextField.getX() + this.inputTextField.getWidth(), this.inputTextField.getY(), this.inputTextField.getWidth(), this.inputTextField.getHeight());
        this.add(this.searchButton);

        this.imageIcon1 =new ImageIcon(this.getClass().getResource(Constants.PATH_RESOURCE));
        this.imageLabel1 =new JLabel(imageIcon1);
        this.imageLabel1.setSize(Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGHT);
        this.imageLabel1.setBounds(50,100,300,300);
        this.add(imageLabel1);

        this.imageIcon2 =new ImageIcon(this.getClass().getResource(Constants.PATH_RESOURCE));
        this.imageLabel2 =new JLabel(imageIcon1);
        this.imageLabel2.setSize(Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGHT);
        this.imageLabel2.setBounds(this.imageLabel1.getX() + 4*this.imageLabel1.getWidth() - 60, 100, this.imageLabel1.getWidth(),this.imageLabel1.getHeight());
        this.add(imageLabel2);

        this.setVisible(true);

    }
}
