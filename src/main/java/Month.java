import java.util.ArrayList;


public class Month {
	
	static String name;
	enum Year{January,Febuary,March,April,May,June,July,August,September,October,November,December};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	private static int[] numDays={31,28,30,31,30,31,31,30,30,31,30,31};  
	private static int last,  first, days;
	private static int[][] dayCount= new int [5][7];
	ArrayList<Month> Cal= new ArrayList<Month>();
	
	Year yr;
	
	public Month(){
		//this.name= name; this.days=days; 
		
		
		
			for(int j=0;j<numDays.length;j++) days=numDays[j];
				
			System.out.println("Welcome to a 2015 Calendar\n");
	}
	//calAlg equals the last position in the week of the previous month.
	//Fills the month to the number of numDays at the correct start day.
	
	
	public void setMonth(){
		
		
	}
	
	public static void main(String args[]){
		//Month Jan= new Month("January",31);
		Date dte=new Date();
		dte.calAlg();
	}//end main
}//end class

