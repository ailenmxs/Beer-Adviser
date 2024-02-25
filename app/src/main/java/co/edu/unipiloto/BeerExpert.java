package co.edu.unipiloto;

import android.content.Context;
public class BeerExpert {
    public String[] beers;
    public BeerExpert(Context context){
        this.beers = context.getResources().getStringArray(R.array.beers);
    }
    public String getBrands(String beer){
        switch (beer) {
            case "light":
                return this.beers[0];
            case "amber":
                return this.beers[1];
            case "brown":
                return this.beers[2];
            case "dark":
                return this.beers[3];
        }
        return "Beer type not selected";
    }
}
