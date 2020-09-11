package cpproyecto1;

public class Ball extends Thread {
    
    private int pasoX = 1;
    private int pasoY = 1;
    
    private final int maxWidth;
    private final int maxHeight;
    private int padding = 20;
    
    private final BallPanel ballPanel;
    private final X x;
    private final Y y;

    public Ball(BallPanel ballPanel, X x, Y y) {
        this.ballPanel = ballPanel;
        this.x = x;
        this.y = y;        
        
        maxWidth = ballPanel.getWidth() - padding;
        maxHeight = ballPanel.getHeight() - padding;
    }
    
    @Override
    public void run() {
        
        while (true) {
            try {
                
                if (x.getX() < 0 || x.getX() >= maxWidth) {
                    pasoX *= -1;
                } else if (y.getY() < 0 || y.getY() >= maxHeight) {
                    pasoY *= -1;
                }
                
                x.setX(x.getX() + pasoX);
                y.setY(y.getY() + pasoY);
                
                ballPanel.repaint();
                
                Thread.sleep(5);                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
    
}
