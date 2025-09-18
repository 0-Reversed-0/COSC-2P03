public class Tester
{
    ArrayList<Integer> arrayList = new ArrayList<>();

    public Tester()
    {
        for (int i = 0; i < 20; i++)
        {
            arrayList.add(i);
        }
    }

    public static void main(String[] args)
    {
        new Tester();
    }
}
