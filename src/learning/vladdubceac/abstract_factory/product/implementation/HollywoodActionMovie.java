package learning.vladdubceac.abstract_factory.product.implementation;

import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;

public class HollywoodActionMovie implements HollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "True Lies is a Hollywood Action Movie";
    }
}
