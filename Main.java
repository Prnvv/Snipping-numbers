public class Main{
	
	public static void main(String args[]){

		int start = 0;
		int end = 105;

		for(int i = start; i<=end;i++){
			checkStepping(i);
		}
	}

	public static void checkStepping(int num){

		String strNum = Integer.toString(num);
		boolean flag = true;

		for(int i = 1; i<= strNum.length()-1;i++){

			if (!(Math.abs(Character.valueOf(strNum.charAt(i)) - Character.valueOf(strNum.charAt(i-1))) == 1)){
				flag = false;
				break;
			}

		}

		if(flag){
			System.out.println(num);
		}
	}
}
