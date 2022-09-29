public class Letter
{
    public void writeLetter(String fromName)
    {
        greeting(fromName);
        specialMessage();
        closing();
    }

    public void greeting(String fromName)
    {
        System.out.println("Hello, " + fromName + "!");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("From, Mr.Das");
    }
}
