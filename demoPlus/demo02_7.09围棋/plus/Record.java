public class Record{
	Record(){}
	public String[][][] record=new String[361][19][19];
	public String[][] nowSituation=new String[19][19];
	int step=0;
	String ifChange="unchange";
	public void setNowSituation(){
		for(int i=1;i<=step;i++){
			lo:for(int j=0;j<19;j++){
				for(int k=0;k<19;k++){
					if(record[i][j][k]=="white"||record[i][j][k]=="black"){
						nowSituation[j][k]=record[i][j][k];
						break lo;
					}
				}
			}
		}
	}
}