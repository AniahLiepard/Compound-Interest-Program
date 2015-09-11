public class ProjectTwenty {
	public static void main(String args[]){
		double total;
		double protocol = 5000;
		double percentage = 0.57;
		
		for(int program=0;program<=10;program++){
			total=protocol*Math.pow(1 + percentage, program);
			System.out.println(program + "  " + total);
		}
	}
}
