package ex_11082024.AbstractClassEX.RealLifeEx;

abstract class Baseclass extends GrandBaseClass{
    // hide the functionality of open and close browser

    abstract String OpenBrowser();
    abstract String CloseBrowser();

    @Override
    void TakeScreenShot() {
        System.out.println("Take Screenshot");
    }

}
