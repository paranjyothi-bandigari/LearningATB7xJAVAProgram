package ex_11082024.AbstractClassEX.RealLifeEx;

public class FireFox extends Baseclass{
    @Override
    String OpenBrowser() {
        System.out.println("open FF");
        return "FF Opened";
    }

    @Override
    String CloseBrowser() {
        System.out.println("Close FF");
        return "Ff Closed";
    }


}
