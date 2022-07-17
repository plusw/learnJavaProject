//启动围棋主方法


/*	1.初始化界面     Map类帮我拿来棋盘                */
/*	2.初始化棋子           Piece类帮我拿来棋子              */
/*  3.初始化游戏规则       Referee类帮我念游戏规则			*/
/*  4.记录分析五子棋位置   Record类帮我记录每一招五子棋位置			*/
/*  5.模拟玩家             Player类被我请来下棋，2个        */
/*  6.可视化界面           Magician类帮我让以上对象显形     */
import javax.swing.JPanel;
import java.util.Arrays;
import java.util.HashSet;
public class StartGame{
	
	public static void main(String[] args){
		System.out.println("开始五子棋游戏");
		
		Map gobangMap=new Map();
		Record record=new Record();
		Magician magician=new Magician();
		Magician.GobangMapAndPieces map=magician.draw(record,gobangMap);
		Referee referee=new Referee();
		Player human=new Player(record,map,gobangMap,"first","black");
		Player human2=new Player(record,map,gobangMap,"second","white");
		
		//magician.new GobangMapAndPieces();
		//map=magician.draw(record,gobangMap);//创建jpanel用于player类监听键盘
		
		String result="noWinner";
		while(result=="noWinner"){
			if(record.ifChange=="changed"){
				map.repaint();
				HashSet allPieceWithPiece=referee.findAllPieceWithPiece(record);
				record.ifChange="unchange";
			}
		}
	}
}