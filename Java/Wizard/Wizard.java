public class Wizard
{
    protected String name;
    protected String color;
    
    public Wizard(String name)
    {
        this.name = name;
        System.out.println("I am " + name + " the " + color );
    }
    
    public void castSpell()
    {
        System.out.println("A spell is cast!");
    }
    
    public void castSpell(String name)
    {
        System.out.println("The " + name + "spell is cast");
    }
    public void printAbilities()
    {
        System.out.println("");
        System.out.println("Abilities of " + name + " the " + color);
        castSpell();
    }
}