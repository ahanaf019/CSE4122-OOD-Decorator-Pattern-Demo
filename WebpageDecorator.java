public abstract class WebpageDecorator implements IWebpage {

    protected Webpage decoratedWebpage;

    public WebpageDecorator(Webpage webpage) {
        this.decoratedWebpage = webpage;
    }

    @Override
    public void display() {
        decoratedWebpage.display();
    }
    
}