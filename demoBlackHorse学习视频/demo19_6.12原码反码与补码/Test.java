/*
正数的反码与原码相同，负数的反码与原码取反，符号位除外
正数的补码与原码相同，负数的补码是在反码的末尾加1
*/

public  class Test{
	public static void main(String args[]){
		//130：1000 0010    转byte类型，范围外先变补码，再推原码
		//补码 1000 0010
		//反码 1000 0001
		//原码 0111 1110   为126
		//(byte)130=-126
		byte a=(byte)130;
		System.out.println(a);
		
		
		
		
		
		
	}
}

		