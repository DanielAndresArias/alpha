package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    MenuView menuView;
    public MainView() {
        setDefaultConfiguration();
        menuView = new MenuView();
        this.add(menuView);
    }

    private void setDefaultConfiguration (){
        this.setTitle("Snake");
        this.setSize(new Dimension(800, 800));
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
