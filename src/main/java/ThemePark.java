import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.reviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
         return this.reviewed;
    }
}
