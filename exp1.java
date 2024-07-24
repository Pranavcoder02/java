
import java.util.*;
class exp1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day month and year: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

                System.out.println(day +" "+ month +" "+ year);

                int ordinaryyear[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
                int no_of_days=day;

                for(int i=0;i<month;i++)
                        {
                                no_of_days+=ordinaryyear[i];
                        }

                if(year%4==0 && month>2)
                {
                        no_of_days+=1;
                }

                System.out.println("Number of Days="+no_of_days);
                int odd_days=no_of_days%7;
                System.out.println("Odd days in year "+odd_days);
                year=year-1;

                        int total_no_centuries=year/400;
                        System.out.println("No of centuries="+total_no_centuries);

                        int remaining_yrs=year%400;
                        System.out.println("remaining years="+remaining_yrs);

                        int total_remaining_years=remaining_yrs/100;
                        System.out.println("total remaining years="+total_remaining_years);

                        int final_year=remaining_yrs%100;
                        System.out.println("final years="+final_year);

                        odd_days+=(total_remaining_years*5);

                        int centuries_completed=(total_no_centuries*400)+(total_remaining_years*100);
                        System.out.println(centuries_completed);
                        for(int i=centuries_completed+1 ;i<=year;i++)
                        {
                                if((i%4==0 && i%100!=0 ) || (i%400==0 && i%100==0))
                                {
                                        odd_days+=2;
                                }
                                else
                                {
                                        odd_days+=1;
                                }

                        }
                System.out.println("Odd days="+odd_days);
                while(odd_days>=7)
                {
                        odd_days=odd_days%7;
                }
                System.out.println("total number of odd day"+odd_days);

                switch (odd_days) {
                        case 0-> System.out.println("Its sunday");
                        case 1-> System.out.println("Its monday");
                        case 2-> System.out.println("Its tuesday");
                        case 3-> System.out.println("Its wednesday");
                        case 4-> System.out.println("Its thrusday");
                        case 5-> System.out.println("Its friday");
                        case 6-> System.out.println("Its saturday");

}
}
}

