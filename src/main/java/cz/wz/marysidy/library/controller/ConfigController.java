package cz.wz.marysidy.library.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${app.title}")
    private String appTitle;

    @Value("${app.description}")
    private String appDescription;

    @Value("${app.version}")
    private String appVersion;

    @Value("${author.name}")
    private String authorName;

    @Value("${author.email}")
    private String authorEmail;

    @GetMapping("/config")
    public String getAppConfig() {
        return String.format(
                "%s v%s - %s (author: %s, %s)",
                appTitle, appVersion, appDescription, authorName, authorEmail
        );
    }
}
