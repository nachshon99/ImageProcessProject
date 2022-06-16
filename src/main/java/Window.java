import javax.swing.*;

public class Window extends JFrame {
    public static void main(String[] args) {
        new Window();
    }

    public Window(){
        this.setSize(Constants.WINDOW_WIDTH,Constants.WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        MainScene main = new MainScene();
        this.add(main);
        this.setVisible(true);
    }
}
