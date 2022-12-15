package app.model;

import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog extends  Animal{

    public String toString() {
        return "I'm a dog";
    }


}
