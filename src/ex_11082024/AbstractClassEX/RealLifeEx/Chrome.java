package ex_11082024.AbstractClassEX.RealLifeEx;

public class Chrome extends Baseclass{
    @Override
    String OpenBrowser() {
        System.out.println("open Chrome");
        return "Chrome opened";
    }

    @Override
    String CloseBrowser() {
        System.out.println("Close Chrome");
        return "chrome closed";
    }


}
