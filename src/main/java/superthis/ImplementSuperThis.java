package superthis;

public class ImplementSuperThis extends testSuperThis{

    String testsuper="Child class";
    public void testsupthi()
    {
        System.out.println(testsuper);
        System.out.println(this.testsuper);
        System.out.println(super.testsuper);
        System.out.println("Added fo git practice");
    }

    public static void main(String arr[])
    {
        ImplementSuperThis im = new ImplementSuperThis();
        im.testsupthi();
    }
}
