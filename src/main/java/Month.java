import java.util.ArrayList;

//import Date.NAMES;


public class Month {
	
	static String name;
	enum NAMES{January,Febuary,March,April,May,June,July,August,September,October,November,December};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	public static final int[] numDays={31,28,30,31,30,31,31,30,30,31,30,31};  
	public static final int last,  first, days;
	public static final 
	int[][] dayCount= new int [5][7];
	ArrayList<Month> Cal= new ArrayList<Month>();
	Date dte=new Date();
	NAMES mo;;
	
	public Month(String name){
		//this.name= name; this.days=days; 
		
		
		
			for(int j=0;j<numDays.length;j++) days=numDays[j];
				
			System.out.println("Welcome to a 2015 Calendar\n");
	}
	//calAlg equals the last position in the week of the previous month.
	//Fills the month to the number of numDays at the correct start day.
	
	public void setMonth(String nameIn)
    {
        int start = (int) Year.January.ordinal();
        int end = (int) Year.December.ordinal();
        for (int i = start; i < end; i++)
        {
            if ( Month.NAMES[ i ] == nameIn )
            {   
                name = Month.NAMES[ i ];
                length = Month.NUM_DAYS[ i ];   
                index = i;
    
                return;
            }
        }
    }
