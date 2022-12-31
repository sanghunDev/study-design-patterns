package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    /**
     * 가격을 구하는게 Client가 아닌 Bag의 책임이 된다
     * @return
     */
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
