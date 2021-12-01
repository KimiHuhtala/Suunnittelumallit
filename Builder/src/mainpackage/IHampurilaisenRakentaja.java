package mainpackage;

public interface IHampurilaisenRakentaja {

    public void createNewHamburger();
    public void buildBun(boolean top);
    public void buildPatty();
    public void buildSalad();
    public void buildMayonnaise();
    public void buildExtra();

    public IHampurilainen getHamburger();
}
