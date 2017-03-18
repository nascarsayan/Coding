public class GreyWizard extends BrownWizard
{
    public GreyWizard(String name)
    {
        super(name);
        color = "Grey";
    }
    
    public void readMind()
    {
        super.readMind();
        System.out.println("I can also control the minds of others in the process");
    }
    
    public final void fightBalrog()
    {
        System.out.println("Thou shalt not pass");
    }
    
    public void printAbilities()
    {
        super.printAbilities();
        fightBalrog();
    }
}