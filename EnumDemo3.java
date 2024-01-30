public class EnumDemo3
{    
    enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args) 
    {
            //Days day=Days.SUNDAY;
            Days day=Days.TUESDAY;
            int count=switch (day) 
            {
                case MONDAY,FRIDAY,SUNDAY->6;
                case TUESDAY->7;
                case WEDNESDAY->9;
                case THURSDAY,SATURDAY->8;
                default->0;
            };
            System.out.printf("Count:\t%d",count);
    }
}
