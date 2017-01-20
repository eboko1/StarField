import javax.swing.*;

/**
 * Created by Vika on 17.01.2017.
 */
public class Star extends JFrame {
    int x;
    int y;
    int z;


    public final int WIDTH=400;
    public final int HEIGHT=400;

    public Star (){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        add(new StarPanel());
    }
    public static void main (String[] args) {
        new Star();
    }

}


