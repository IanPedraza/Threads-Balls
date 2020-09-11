package cpproyecto1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class BallPanel extends JPanel{
    
    private X x;
    private Y y;
    private BallNumber ballNumber;

    public BallPanel(X x, Y y, BallNumber ballNumber) {
        this.x = x;
        this.y = y;
        this.ballNumber = ballNumber;
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(x.getX(), y.getY(), 20, 20));
        
        g2.setColor(Color.WHITE);
        g2.drawString(String.valueOf(ballNumber.getCounter()), x.getX()+9, y.getY()+14);
    }
    
}
