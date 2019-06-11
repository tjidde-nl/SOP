package Services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomService {
    public double getRandom(){
        double a= Math.random();
        return a;
    }
}
