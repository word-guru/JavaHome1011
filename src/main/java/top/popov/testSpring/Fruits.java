package top.popov.testSpring;

import org.springframework.stereotype.Component;



@Component
public class Fruits implements Fridge{
    @Override
    public String showSectionContent() {
        return "This section content different kinds of fruits";
    }
}
