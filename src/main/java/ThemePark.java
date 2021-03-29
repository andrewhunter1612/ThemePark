import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> revieweds;

    public ThemePark() {
        this.revieweds = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllRevieweds() {
        return revieweds;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.increaseVisitCount();
        visitor.addVisitedAttraction(attraction);
    }
}
