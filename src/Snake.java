import View.MainView;

import java.awt.EventQueue;

public class Snake {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainView frame = new MainView();
            }
        });
    }
}
