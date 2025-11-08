import java.awt.*;
import javax.swing.*;

public class AppWindowMain extends JFrame {

    public AppWindowMain() {
        setTitle("游戏助手");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);

        // 创建面板和组件
        JPanel battonPanel = new JPanel();
        JPanel functionPanel = new JPanel();
        functionPanel.setBackground(new Color(173, 216, 230));

        // 创建按钮
        JButton dontStarveButton = new JButton("Don't Starve");
        JButton minecraftButton = new JButton("Minecraft");
        JButton leagueButton = new JButton("League of Legends");
        JButton zhouyButton = new JButton("三角洲行动");

        // 设置按钮样式
        Font buttonFont = new Font("微软雅黑", Font.BOLD, 14);
        Dimension buttonSize = new Dimension(180, 40);

        JButton[] buttons = {dontStarveButton, minecraftButton, leagueButton, zhouyButton};
        for (JButton button : buttons) {
        button.setFont(buttonFont);
        button.setPreferredSize(buttonSize);
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false); // 去除焦点边框
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        button.addActionListener(e -> {});
        }


        // 设置按钮面板布局
        battonPanel.setLayout(new GridLayout(8, 1));
        for(int i = 0; i < buttons.length && i<8; i++){
                if(buttons[i]!=null){
                        battonPanel.add(buttons[i]);
                }
        }

        // 使用分割面板
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, battonPanel, functionPanel);
        splitPane.setDividerLocation(200);
        splitPane.setResizeWeight(0.2);

        add(splitPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AppWindowMain().setVisible(true);
        });

    }
}
