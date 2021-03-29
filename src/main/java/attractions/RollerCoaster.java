package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 1.45 && visitor.getAge() > 12;
    }

    @Override
    public double defaultPrice() {
        return PriceType.ROLLERCOASTER.getPrice();
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (isAllowedTo(visitor)){
            if (visitor.getHeight() > 2){
                return defaultPrice() * 2;
            }
            return defaultPrice();
        }
        return 0.0;
    }
}
