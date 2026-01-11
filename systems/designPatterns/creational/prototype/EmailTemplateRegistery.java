package designPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistery {
    private static final Map<String, EmailTemplate> templates = new HashMap<>();

    static {
        templates.put("welcome", new WelcomeEmail());
        // Add more templates like discount, offer etc
    }

    public static EmailTemplate getTemplate(String type){
        return templates.get(type).clone(); // clone to avoid modifying original
    }
}
