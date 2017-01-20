import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 19.01.2017.
 */
public class StarPanel extends JPanel implements ActionListener{
    public StarPanel(){

            Timer timer = new Timer(40,this);
            timer.start();
        }


    public void update(){

    }
    public void paint(Graphics g){

        g.drawOval(3,5,30,40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

