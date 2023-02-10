package learning.vladdubceac.abstract_factory.product.implementation;

import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;

public class BollywoodActionMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Bang-Bang is a Bollywood Action Movie";
    }
}
