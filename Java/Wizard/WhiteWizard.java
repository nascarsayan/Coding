public class WhiteWizard extends GreyWizard
{
    public WhiteWizard(String name)
    {
        super(name);
        color = "White";
    }
    
    public void printAbilities()
    {
        super.printAbilities();
        System.out.println("Now I'm far more wise, and lead the Istari");
    }
    
    public static void main(String args[])
    {
        BrownWizard radagast = new BrownWizard("Radagast");
        GreyWizard gandalf = new GreyWizard("Gandalf");
        WhiteWizard saruman = new WhiteWizard("Saruman");
        Wizard w = new WhiteWizard("X");
        
        radagast.printAbilities();
        gandalf.printAbilities();
        saruman.printAbilities();
    }
}