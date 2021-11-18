package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Autowired
    private Timer timer;

    @Override
    public String toString() {
        return "I'm a Dog";
    }

}
