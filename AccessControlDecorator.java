public class AccessControlDecorator extends WebpageDecorator {

    private int minAccessLevel;
    private int userAccessLevel = -1;


    public AccessControlDecorator(Webpage webpage, int accessControl) {
        super(webpage);
        this.minAccessLevel = accessControl;
    }
    
    public int getMinAccessLevel() {
        return minAccessLevel;
    }

    public void setUserAccessLevel(int userAccessLevel) {
        this.userAccessLevel = userAccessLevel;
    }


    @Override
    public void display() {
        if(userAccessLevel < minAccessLevel) {
            System.out.println("User is not authorized to the website");
            return;
        }

        System.out.println("Congratulations! You have access to the website.");
        super.display();
    }
}
