import java.util.Stack;

public class WebBrowserNavigator {
    private Stack<String> backwardStack;
    private Stack<String> forwardStack;
    private String currentUrl;

    public WebBrowserNavigator() {

        backwardStack = new Stack<>();
        forwardStack = new Stack<>();
        currentUrl = "";
    }

    public void visitPage(String url) {
        if (!currentUrl.isEmpty()) {
            backwardStack.push(currentUrl);
            forwardStack.clear();
        }
        currentUrl = url;
        System.out.println("Visiting page: " + url);
    }

    public void back() {
        if (!backwardStack.isEmpty()) {
            forwardStack.push(currentUrl);
            currentUrl = backwardStack.pop();
            // Add code here to actually go back to the previous page, e.g., navigate back in a browser.
            System.out.println("Going back to: " + currentUrl);
        } else {
            System.out.println("No previous page to go back to.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backwardStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println("Going forward to: " + currentUrl);
        } else {
            System.out.println("No forward page to go to.");
        }
    }

    public static void main(String[] args) {
        WebBrowserNavigator browser = new WebBrowserNavigator();

        browser.visitPage("https://www.example.com");
        browser.visitPage("https://www.google.com");
        browser.visitPage("https://www.openai.com");

        // Go back to the previous page
        browser.back(); // This should go back to "https://www.google.com"

        // Go forward to the next page
        browser.forward(); // This should go forward to "https://www.openai.com"
    }
}
