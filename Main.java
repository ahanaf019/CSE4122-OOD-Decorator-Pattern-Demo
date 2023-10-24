public class Main {
    public static void main(String[] args) {
        Webpage webpage = new Webpage("Hello, this is my webpage");

        SplittingDecorator splittingDecorator = new SplittingDecorator(webpage);

        splittingDecorator.displayWebpageOne();
        System.out.println("\n");
        splittingDecorator.displayWebpageTwo();

        AccessControlDecorator accessControlDecorator = new AccessControlDecorator(webpage, 5);

        accessControlDecorator.display();


    }
}
