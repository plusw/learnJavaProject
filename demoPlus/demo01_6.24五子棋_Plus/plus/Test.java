import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class Test extends JFrame
{
    public Test()
    {
        setTitle("Java 第一个 GUI 程序");    //设置显示窗口标题
        setSize(400,200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JLabel jl=new JLabel("这是使用JFrame类创建的窗口");    //创建一个标签
        Container c=getContentPane();    //获取当前窗口的内容窗格
        c.add(jl);    //将标签组件添加到内容窗格上
        setVisible(true);    //设置窗口是否可见
    }
	class Map extends JPanel{
		public void paintComponent(Graphics g) {
				super.paintComponent(g);
				// 棋盘
				g.setColor(new Color(200, 100, 50)); // 设为桔黄色
		}
	}
    public static void main(String[] agrs)
    {
        Test aa=new Test();    //创建一个实例化对象
		aa.add(new Map());
    }
}