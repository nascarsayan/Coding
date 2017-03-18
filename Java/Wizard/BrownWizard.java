public class BrownWizard extends Wizard
{
    public BrownWizard(String name)
    {
        super(name);
        color = "Brown";
    }
    
    public void readMind()
    {
        System.out.println("I can read minds of others");
    }
    
    public void printAbilities()
    {
        super.printAbilities();
        readMind();
    }
}