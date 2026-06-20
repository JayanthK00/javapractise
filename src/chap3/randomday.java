public class randomday {
    public static void main(String[] args) {
        String[] days={"mon","tue","wed","thru","fri","sat","sun"};
        int index=(int)(Math.random()*7);
        String day=days[index];
        System.out.println("number="+(index+1));//cause array start from zero thats why
        System.out.println("day="+day);
        if(index>=5) {
            System.out.println("weekend");
        }else
            System.out.println("weekday");

    }
}
