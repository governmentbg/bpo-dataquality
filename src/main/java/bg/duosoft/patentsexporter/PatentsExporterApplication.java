package bg.duosoft.patentsexporter;

import bg.duosoft.patentsexporter.util.appinfo.AppInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PatentsExporterApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PatentsExporterApplication.class);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PatentsExporterApplication.class, args);
        AppInfo.logApplicationInfo(run);
    }

}
