import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;

public class Magician{
	public Magician(){}
	
	class Window extends JFrame{
		public Window(){
			this.setTitle("五子棋");    //设置显示窗口标题
			this.setSize(590,590);    //设置窗口显示尺寸
			this.setLocation(250, 50);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
			this.setVisible(true);    //设置窗口是否可见
			
			//gobangWindow.pack(); 		
		}
	}
	class GobangMapAndPieces extends JPanel{
		Map map;
		Record record;
		GobangMapAndPieces(){};
		GobangMapAndPieces(Record record,Map map){
			this.map=map;
			this.record=record;
		};
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 棋盘
			g.setColor(new Color(200, 100, 50)); // 设为桔黄色
			g.fillRect(0, 0, map.ROW_WIDTH * (map.BOARD_SIZE + 1), map.ROW_WIDTH
					* (map.BOARD_SIZE + 1)); // 填充棋盘
			g.setColor(Color.black); // 设为黑色
			for (int i = 0; i < map.BOARD_SIZE; i++) {// 画竖线
				g.drawLine(map.SPACE + map.ROW_WIDTH * i, map.SPACE, map.SPACE + map.ROW_WIDTH * i,
						map.SPACE + map.ROW_WIDTH * (map.BOARD_SIZE - 1));
			}
			for (int i = 0; i < map.BOARD_SIZE; i++) {// 画横线
				g.drawLine(map.SPACE, map.SPACE + map.ROW_WIDTH * i, map.SPACE + map.ROW_WIDTH
						* (map.BOARD_SIZE - 1), map.SPACE + map.ROW_WIDTH * i);
			}
			// 画点
			g.fillOval(map.SPACE + 3 * map.ROW_WIDTH - 3, map.SPACE + 3 * map.ROW_WIDTH - 3, 7,
					7);
			g.fillOval(map.SPACE + 11 * map.ROW_WIDTH - 3, map.SPACE + 3 * map.ROW_WIDTH - 3,
					7, 7);
			g.fillOval(map.SPACE + 3 * map.ROW_WIDTH - 3, map.SPACE + 11 * map.ROW_WIDTH - 3,
					7, 7);
			g.fillOval(map.SPACE + 7 * map.ROW_WIDTH - 3, map.SPACE + 7 * map.ROW_WIDTH - 3, 7,
					7);
			g.fillOval(map.SPACE + 11 * map.ROW_WIDTH - 3, map.SPACE + 11 * map.ROW_WIDTH - 3,
					7, 7);
			//棋子
			for(int k=1;k<=record.step;k++){
				for (int i = 0; i < map.BOARD_SIZE; i++) {
					for (int j = 0; j < map.BOARD_SIZE; j++) {
						if (record.record[k][i][j] == "black") {// 绘制黑棋
							g.setColor(Color.black);
							g.fillOval(map.SPACE + i * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.SPACE
									+ j * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.ROW_WIDTH,
									map.ROW_WIDTH);
						}
						if (record.record[k][i][j] == "white") {// 绘制白棋
							g.setColor(Color.white);
							g.fillOval(map.SPACE + i * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.SPACE
									+ j * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.ROW_WIDTH,
									map.ROW_WIDTH);
						}
					}
				}
			}
		}
	}
	/*
	class gobangPiece extends JPanel{
		int map.BOARD_SIZE = 15; // 棋盘大小(15 * 15)
		int map.ROW_WIDTH = 36; // 间距
		int map.SPACE = map.ROW_WIDTH / 2; // 上下边间距
		String[][] location=new String[19][19];
		gobangPiece(){}
		gobangPiece(Record record){
			for(int i=0;i<19;i++){
				for(int j=0;j<19;j++){
					this.location[i][j]=record.record[record.step-1][i][j];
				}
			}
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < map.BOARD_SIZE; i++) {
				for (int j = 0; j < map.BOARD_SIZE; j++) {
					if (location[i][j] == "black") {// 绘制黑棋
						g.setColor(Color.black);
						g.fillOval(map.SPACE + i * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.SPACE
								+ j * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.ROW_WIDTH,
								map.ROW_WIDTH);
					}
					if (location[i][j] == "white") {// 绘制白棋
						g.setColor(Color.white);
						g.fillOval(map.SPACE + i * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.SPACE
								+ j * map.ROW_WIDTH - map.ROW_WIDTH / 2, map.ROW_WIDTH,
								map.ROW_WIDTH);
					}
				}
			}
		}
	}
	*/
	public GobangMapAndPieces draw(Record record,Map map){
		Window gobangWindow=new Window(); 
		GobangMapAndPieces gobangPieceAndMap=new GobangMapAndPieces(record,map);
		gobangWindow.add(gobangPieceAndMap);
	
		return gobangPieceAndMap;
	}
}
	
	
	
		
		
		
