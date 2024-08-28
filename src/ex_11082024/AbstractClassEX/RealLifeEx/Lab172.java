package ex_11082024.AbstractClassEX.RealLifeEx;

public class Lab172 {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.OpenBrowser();
        c.CloseBrowser();
        c.TakeScreenShot();
        FireFox FF=new FireFox();
        FF.OpenBrowser();
        FF.CloseBrowser();

    }
}
