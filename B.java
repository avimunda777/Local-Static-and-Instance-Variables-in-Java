class B
{
    static int c = 20; // Static
    int f = 30; // Instance
    public static void main(String[] args)
    {
        int b = 10; // Local
        B ref = new B ();
        System.out.println(b);
        System.out.println(B.c);
        System.out.println(ref.f);
    }
}