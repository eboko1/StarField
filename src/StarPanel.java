import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vika on 19.01.2017.
 */
public class StarPanel extends JPanel implements ActionListener{
    StarField stars = new StarField();

    public StarPanel(){

            Timer timer = new Timer(40,this);
            timer.start();
        }


    public void update(){


   // for (int i=0;i<stars.length;i++){
   //     stars[i] = new StarField();
   // }

    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(3,5,9,9);
        //for (int i=0;i<stars.length;i++){
        //    stars[i] = update();

      //  }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
}

