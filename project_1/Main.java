import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        
        String baseDir = new File(".").getAbsolutePath();
        tomcat.setBaseDir(baseDir);
        
        // Fix: Use empty string for root context
        tomcat.addWebapp("", baseDir);
        
        // Start server
        tomcat.start();
        System.out.println("Server started at http://localhost:8080");
        tomcat.getServer().await();
    }
}
