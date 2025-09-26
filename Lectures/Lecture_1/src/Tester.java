public class Tester
{
    ArrayList<Integer> arrayList = new ArrayList<>();

    public Tester()
    {
        for (int i = 0; i < 20; i++)
        {
            arrayList.add(i);
        }

        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args)
    {
        new Tester();
    }
}
