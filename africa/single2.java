 class single2 {
    public static void main(String args[])
    {
        Son o =new Son();
        o.car();
        o.house();
    }
}
{
    public void house()
    {
        System.out.println("Have Own 2BHK House.");
    }
}
class Son extends Father 
{
    public void car()
    {
        System.out.println("Have Own Audi Car.");
    }
}
 
