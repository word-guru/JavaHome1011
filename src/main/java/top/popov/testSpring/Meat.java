package top.popov.testSpring;

import org.springframework.stereotype.Component;

@Component
public class Meat implements Fridge{
    @Override
    public String showSectionContent() {
        return "This section content different kinds of meat";
    }
}
