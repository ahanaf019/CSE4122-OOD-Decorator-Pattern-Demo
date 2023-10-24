public class Main {
    public static void main(String[] args) {
        Webpage webpage = new Webpage("Hello, this is my webpage");

        SplittingDecorator splittingDecorator = new SplittingDecorator(webpage);

        splittingDecorator.displayWebpageOne();
        System.out.println("\n");
        splittingDecorator.displayWebpageTwo();
        

        System.out.println("\n");
        System.out.println("\n");
        AccessControlDecorator accessControlDecorator = new AccessControlDecorator(webpage, 5);

        accessControlDecorator.display();
        
        System.out.println("\nUpdating access level of user");
        accessControlDecorator.setUserAccessLevel(7);
        accessControlDecorator.display();

    }
}
