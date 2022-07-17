//裁判类
/*
 
裁判说双方开始
(裁判说谁先谁后)
裁判判断双方是否合乎规则
裁判判断谁赢了



*/
import java.util.Objects;
import java.util.HashSet;
public class Referee{
	Referee(){};
	public HashSet<PieceWithPiece> findAllPieceWithPiece(Record record){ 
		HashSet<PieceWithPiece> allPieceWithPiece=new HashSet<PieceWithPiece>();
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				if(record.nowSituation[j][i]=="white"){
					//if("不属于任何一个PieceWithPiece类"){
					lo:for(PieceWithPiece pieceWithPiece : allPieceWithPiece){
						for(OnePieceLocation onePieceLocation : pieceWithPiece.allPieceLocation){
							if(!(j==onePieceLocation.x && i==onePieceLocation.y)){
								PieceWithPiece a=new PieceWithPiece(record);
								a.findPiecesLocation(j,i);
								allPieceWithPiece.add(a);
							}
							else{
								break lo;
							}
						}
					}
				}
			}
		}
		return allPieceWithPiece;
	}
	class OnePieceLocation{
		int x;
		int y;
		OnePieceLocation(){};
		OnePieceLocation(int x,int y){
			this.x=x;
			this.y=y;
		};
		public int hashCode(int x,int y){
			return Objects.hash(x,y);
		}
	}
	class PieceWithPiece{
		HashSet<OnePieceLocation> allPieceLocation=new HashSet<>();
		String color;
		Record record;
		PieceWithPiece(){};
		PieceWithPiece(Record record){
			this.record=record;
		};	
		public void findPiecesLocation(int x,int y){
			{
				OnePieceLocation a=new OnePieceLocation(y,x);
				allPieceLocation.add(a);
			}
			
			if(record.nowSituation[y+1][x]=="white"){
				OnePieceLocation a=new OnePieceLocation(y+1,x);
				if(allPieceLocation.add(a)){
					findPiecesLocation(a.x,a.y);
				}
			}
			if(record.nowSituation[y-1][x]=="white"){
				OnePieceLocation a=new OnePieceLocation(y-1,x);
				if(allPieceLocation.add(a)){
					findPiecesLocation(a.x,a.y);
				}
			}
			if(record.nowSituation[y][x+1]=="white"){
				OnePieceLocation a=new OnePieceLocation(y,x+1);
				if(allPieceLocation.add(a)){
					findPiecesLocation(a.x,a.y);
				}
			}
			if(record.nowSituation[y][x-1]=="white"){
				OnePieceLocation a=new OnePieceLocation(y,x-1);
				if(allPieceLocation.add(a)){
					findPiecesLocation(a.x,a.y);
				}
			}
			
		}
	}
	
}