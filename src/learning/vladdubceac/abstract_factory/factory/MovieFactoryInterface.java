package learning.vladdubceac.abstract_factory.factory;

import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;

public interface MovieFactoryInterface {
    HollywoodMovieInterface getHollywoodMovie(MovieGenre genre);
    BollywoodMovieInterface getBollywoodMovie(MovieGenre genre);
}
