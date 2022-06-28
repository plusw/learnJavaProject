
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
public class Player{
	boolean first=true;
	String pieceColor="black";
	Player(Record record,JPanel map,Map gobangMap){
		play(record,map,gobangMap);
	};
	/*
	public int[] listenMouse(JPanel map,Map gobangMap){//map用于鼠标监听,gobangMap用于计算点位
		int[] location=new int[2];
		map.addMouseListener(new MouseAdapter() {
			// 鼠标点击事件
			
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标点击了一下");
				// 将用户鼠标事件的座标转换成棋子数组的座标。
				location[0] = (int) (e.getX() / gobangMap.ROW_WIDTH);//棋盘上X值
				
				location[1] = (int) (e.getY() / gobangMap.ROW_WIDTH);//Y值
				
				
			}
		});		
		return location;
	}*/
	public void play(Record record,JPanel map,Map gobangMap){
		map.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(first==true){
					if(record.step==0){//轮到自己下
						int[] location=new int[2];
						location[0] = (int) (e.getX() / gobangMap.ROW_WIDTH);//棋盘上X值
						location[1] = (int) (e.getY() / gobangMap.ROW_WIDTH);
						int x=location[0];
						int y=location[1];
						System.out.println("x::"+location[0]);
						System.out.println("y:"+location[1]);
						record.step++;
						record.record[record.step][x][y]=pieceColor;
						
						
					}
				}
				/*
				else{//第二个下
					if(record.step/2==1){//轮到自己下
						record.record[record.step][x][y]=pieceColor;
						record.step++;
					}
				}	
				*/
			}
			
		});	
	}
}