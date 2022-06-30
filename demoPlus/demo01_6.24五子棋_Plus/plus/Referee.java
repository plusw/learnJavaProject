//裁判类
/*
 
裁判说双方开始
(裁判说谁先谁后)
裁判判断双方是否合乎规则
裁判判断谁赢了



*/
public class Referee{
	Referee(){};
	public void judgeWinner(Record record){
		/*
		System.out.println(record.nowSituation[0][0]);
		System.out.println(record.nowSituation[1][0]);
		System.out.println(record.nowSituation[2][0]);
		System.out.println(record.nowSituation[3][0]);
		*/
		//i表示行 j表示列
		/*
		for(int i=0;i<19;i++){
			System.out.println();
			for(int j=0;j<19;j++){
				System.out.print(record.record[record.step][i][j]);
				System.out.print(" ");
			}
		}*/
		
		for(int i=0;i<19;i++){
			System.out.println();
			for(int j=0;j<19;j++){
				System.out.print(record.nowSituation[i][j]);
				System.out.print(" ");
			}
		}
		System.out.println("-----");
		//横向找
		String colorWinner;
		int whitePieceNum=0;
		int blackPieceNum=0;
		lo:	for (int i = 0; i < 19; i++) {
				whitePieceNum=0;
				blackPieceNum=0;
				for (int j = 0; j < 19; j++) {
					if(record.nowSituation[i][j]=="white"){
						whitePieceNum++;
						if(whitePieceNum==5){
							colorWinner="white";
							System.out.println(""+colorWinner+"获得胜利！");
							break lo;
						}
					}
					if(record.nowSituation[i][j]=="balck"){
						blackPieceNum++;
						if(blackPieceNum==5){
							colorWinner="black";
							System.out.println(""+colorWinner+"获得胜利！");
							break lo;
						}
					}
					
				}
		}
				
				
		
	}
}