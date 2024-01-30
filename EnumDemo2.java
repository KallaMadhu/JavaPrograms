public class EnumDemo2 
{    
    enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args) 
    {
            Days day=Days.SUNDAY;
            switch (day) 
            {
                case MONDAY->System.out.println("Working day");
                case TUESDAY->System.out.println("Having Meeting");
                case WEDNESDAY->System.out.println("Counting Days About Saturday");
                case THURSDAY->System.out.println("Waiting For Saturday");
                case FRIDAY->System.out.println("Eagerly Waiting For Weekend");
                case SATURDAY->System.out.println("Weekend");
                case SUNDAY->System.out.println("sunday is holiday and funday");
                default->System.out.println("Invalid Option");
            }
    }
}
