import java.awt.*;
import javax.swing.*;
public class AppWindowMain extends JFrame  {    //创建一个窗口
	public static void main(String[] args) {		
       
	    JFrame frame = new AppWindowMain();         //创建一个窗口
        JPanel panel = new JPanel();

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置一个关闭窗口         
	    frame.setSize(1280 , 900);         //setSize()设置窗口大小         
	    frame.setVisible(true);           //setVisible(true)  让窗口显示出来	}
        frame.setTitle("游戏助手");
        frame.setBackground(Color.BLUE);

        frame.add(panel); //将面板添加到窗口中
        panel.setBackground(Color.YELLOW);


        }
    }