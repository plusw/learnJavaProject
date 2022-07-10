//裁判类
/*
 
裁判说双方开始
(裁判说谁先谁后)
裁判判断双方是否合乎规则
裁判判断谁赢了



*/
public class Referee{
	Referee(){};
	public String judgeWinner(Record record){
		//横向找
		String colorWinner;
		int whitePieceNum=0;
		int blackPieceNum=0;
		lo:	for (int i = 0; i < 19; i++) {
				whitePieceNum=0;
				blackPieceNum=0;
				for (int j = 0; j < 19; j++) {
					if(record.nowSituation[j][i]=="white"){
						whitePieceNum++;
						if(whitePieceNum==5){
							colorWinner="white";
							System.out.println(""+colorWinner+"获得胜利！");
							return colorWinner;
						}
					}
					if(record.nowSituation[j][i]=="black"){
						blackPieceNum++;
						if(blackPieceNum==5){
							colorWinner="black";
							System.out.println(""+colorWinner+"获得胜利！");
							return colorWinner;
						}
					}
					
				}
		}
		//纵向找
		whitePieceNum=0;
		blackPieceNum=0;	
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				whitePieceNum=0;
				blackPieceNum=0;
				if(record.nowSituation[j][i]=="white"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j][i+k]=="white"){	
							whitePieceNum++;
							if(whitePieceNum==5){
								colorWinner="white";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
				if(record.nowSituation[j][i]=="black"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j][i+k]=="black"){	
							blackPieceNum++;
							if(blackPieceNum==5){
								colorWinner="black";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
			}
		}
		//斜向下找
		whitePieceNum=0;
		blackPieceNum=0;	
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				whitePieceNum=0;
				blackPieceNum=0;
				if(record.nowSituation[j][i]=="white"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j+k][i+k]=="white"){	
							whitePieceNum++;
							if(whitePieceNum==5){
								colorWinner="white";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
				if(record.nowSituation[j][i]=="black"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j+k][i+k]=="black"){	
							blackPieceNum++;
							if(blackPieceNum==5){
								colorWinner="black";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
			}
		}
		//斜向上找
		whitePieceNum=0;
		blackPieceNum=0;	
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				whitePieceNum=0;
				blackPieceNum=0;
				if(record.nowSituation[j][i]=="white"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j+k][i-k]=="white"){	
							whitePieceNum++;
							if(whitePieceNum==5){
								colorWinner="white";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
				if(record.nowSituation[j][i]=="black"){	
					for(int k=0;k<5;k++){
						if(record.nowSituation[j+k][i-k]=="black"){	
							blackPieceNum++;
							if(blackPieceNum==5){
								colorWinner="black";
								System.out.println(""+colorWinner+"获得胜利！");
								return colorWinner;
							}
						}
						else{
							break;
						}
					}
				}
			}
		}			
				
				
		
			
		return "noWinner";
	}
}