import java.util.ArrayList;


public class Date {
	static String name;
	enum monthName{January,Febuary,March,April,May,June,July,August,September,October,November,December};
	String[] week={"su ","mo ","tu ","we ","th ","fr ","sa "};
	private int numDays=0;  
	private static int last,  first, days,month;
	private static int[][] dayCount= new int [5][7];
	static ArrayList<Month> Cal= new ArrayList<Month>();
	static monthName mo;

public static Month calAlg(monthName mo, int mnth){
		
		int i=0; int j=0; int k=0;
		//
		//name equals the iteration of monthName[];

        //int month = mnth ;
        int year = 2015;
        int numDays = 0;

        switch (mnth) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
            	//run setMonth to display the correct start days for each month
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);
		//if (name=="January"){
		switch(mo) {
			case January:
				
			//add the Months names to the Array Collection	
			System.out.println("Month: January");
			break;
			case Febuary:
			System.out.println("Month: Febuary");
			break;
			case March:
			System.out.println("Month: March");
			break;
			case April:
			System.out.println("Month: April");
			break;
			case May:
			System.out.println("Month: May");
			break;
			case June:
			System.out.println("Month: June");
			break;
			case July:
			System.out.println("Month: July");
			break;
			case August:
			System.out.println("Month: August");
			break;
			case September:
			System.out.println("Month: September");
			break;
			case November:
			System.out.println("Month: November");
			break;
			case December:
			System.out.println("Month: December");
			break;
			}//end switch
		 if (Cal.isEmpty()) {
	            System.out.println("Invalid month number");
	        } else {
	            for (String Cal: yr ) {
	               System.out.println(Cal);
	            }
	        }
		//last equals the number of numDays in the previous month starting with the first
		//definite position in January
		for(i=0; i<5;i++)
			for(j=0; j<7; j++){
				dayCount[i][j]=k;
				k++;
				if (dayCount[0][4]==3){
					
					first=dayCount[0][4];
					
					for(i=0; i<5; i++){
						for(j=0; j<1; j++)
							if (j==1) j=7;
							dayCount[i][j]=days;
							days++;
							if(numDays[i]==31)
								last = first;
							break;
				}//end for
		//}//end if
		
				
		//Display method for all iterations of calAlg();
		for(i=0; i<5; i++){
			for(j=0; j<7; j++)
				if(days==last){
					last = first;
				}
				System.out.print(dayCount[i][j]+ " ");
				System.out.println();
				}//end
		}//end January start
		
			}
			return mnth;
		
	}//end method
}
