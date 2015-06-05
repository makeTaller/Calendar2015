import java.util.ArrayList;

//import Date.MonthName;


public class Month {
	
	static String name;
	enum MonthName{January,Febuary,March,April,May,June,July,August,September,October,November,December};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	public static final int[] numDays={31,28,30,31,30,31,31,30,30,31,30,31};  
	public static final int last,  first, days;
	public static final 
	int[][] dayCount= new int [5][7];
	ArrayList<Month> Cal= new ArrayList<Month>();
	Date dte=new Date();
	MonthName mo;;
	
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
		Month jan= new Month();
		
		jan.dte.calAlg(January,1);
	}//end main
}//end class

