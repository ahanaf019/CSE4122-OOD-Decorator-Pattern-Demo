public class Webpage implements IWebpage {

    private String content;

    public Webpage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("==========================================");
        System.out.println("\t\tWebpage");
        System.out.println("==========================================");
        System.out.println(content);
        System.out.println("==========================================");
    }
    
}
