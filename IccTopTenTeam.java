class IccTopTenTeam {
	static String numberOne="India";
	static String numberTwo="Australia";
	static String numberThree="NewZland";
	static String numberFour="England";
	static String numberFive="SouthAfrica";
	static String numberSix="SriLanka";
	static String numberSeven="WestIndies";
	static String numberEight="Afghanistan";
	static String numberNine="USA";
	static String numberTen="Zimbabwe";
	static String iccTeams[]={numberOne,numberTwo,numberThree,numberFour,numberFive,numberSix,numberSeven,numberEight,numberNine,numberTen};
	public static void main(String[] args){
		System.out.println("Main started");
		for (String team :iccTeams){
			System.out.println(team);
		}
		
		System.out.println("Top Ten teams in the world");
		System.out.println(iccTeams[0]+","+iccTeams[1]+" ,"+iccTeams[2]+","+iccTeams[3]+","+iccTeams[4]+","+iccTeams[5]+","+iccTeams[6]+","+iccTeams[7]+","+iccTeams[8]+","+iccTeams[9]);
	    System.out.println("Main ENded");
	}
	
}