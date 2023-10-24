public class SplittingDecorator extends WebpageDecorator {
    
    private Webpage webpageOne;    
    private Webpage webpageTwo;


    public SplittingDecorator(Webpage webpage) {
        super(webpage);
        webpageOne = webpage;
        webpageTwo = webpage;
    }

    public void displayWebpageOne() {
        System.out.println("Displaying WebpageOne:");
        webpageOne.display();
    }

    public void displayWebpageTwo() {
        System.out.println("Displaying WebpageTwo:");
        webpageTwo.display();
    }
}
