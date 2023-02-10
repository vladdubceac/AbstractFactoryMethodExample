package learning.vladdubceac.abstract_factory.product.implementation;

import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;

public class BollywoodComedyMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Muna Bhai MBBS is a Bollywood Comedy Movie";
    }
}
