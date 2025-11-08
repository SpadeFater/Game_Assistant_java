import java.awt.*;
import javax.swing.*;
public class AppWindowMain extends JFrame  {    //创建一个窗口
	public static void main(String[] args) {		
       
	    JFrame frame = new AppWindowMain();//创建一个窗口

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置一个关闭窗口
        frame.setSize(900 , 600);         //setSize()设置窗口大小
        frame.setVisible(true);           //setVisible(true)  让窗口显示出来	}
        frame.setTitle("游戏助手");
        frame.setBackground(Color.BLACK);
        frame.setLayout(new GridLayout(1,1));

        JPanel battonPanel = new JPanel(); //创建一个面板
        JPanel functionPanel = new JPanel();

        functionPanel.setBackground(Color.BLUE);

        Button dontStarveButton = new Button("Don't Starve");
        Button minecraftButton = new Button("Minecraft");
        Button leagueButton = new Button("League of Legends");
        Button zhouyButton = new Button("三角洲行动");

        battonPanel.setLayout(new GridLayout(8,1));//设置布局,创建一个网格布局,加入按钮
        battonPanel.add(dontStarveButton);
        battonPanel.add(minecraftButton);
        battonPanel.add(leagueButton);
        battonPanel.add(zhouyButton);

        frame.add(battonPanel);  //将面板添加到窗口中
        frame.add(functionPanel);




        }
    }