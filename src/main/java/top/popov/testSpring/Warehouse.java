package top.popov.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Warehouse {
    private Meat section;

    public Warehouse() {}

    @Autowired
    public Warehouse(Meat sect) {
        this.section = sect;
    }

    public void showContent() {
        System.out.println(section.showSectionContent());
    }
}
