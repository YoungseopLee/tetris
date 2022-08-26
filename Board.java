import javax.swing.JFrame;

public class Board extends JFrame{

    public final int SCREEN_WIDTH = 500;
    public final int SCREEN_HEIGHT = 1000;

    public Board(){

        this.setTitle("Tetris");

        this.setSize(500, 1000);   
        //this.setUndecorated(true); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);    
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }


}
