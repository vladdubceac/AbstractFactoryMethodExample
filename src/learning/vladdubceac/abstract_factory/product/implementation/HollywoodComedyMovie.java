package learning.vladdubceac.abstract_factory.product.implementation;

import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;

public class HollywoodComedyMovie implements HollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "The Jerk is a Hollywood Comedy Movie";
    }
}
