package learning.vladdubceac.abstract_factory.factory.implementation;

import learning.vladdubceac.abstract_factory.factory.MovieFactoryInterface;
import learning.vladdubceac.abstract_factory.factory.MovieGenre;
import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.implementation.BollywoodActionMovie;
import learning.vladdubceac.abstract_factory.product.implementation.BollywoodComedyMovie;

public class BollywoodMovieFactory implements MovieFactoryInterface {
    @Override
    public BollywoodMovieInterface getBollywoodMovie(MovieGenre genre) {
        if (genre == null) {
            return null;
        }
        ;
        if (MovieGenre.ACTION == genre) {
            return new BollywoodActionMovie();
        } else if (MovieGenre.COMEDY == genre) {
            return new BollywoodComedyMovie();
        }
        return null;
    }

    @Override
    public HollywoodMovieInterface getHollywoodMovie(MovieGenre genre) {
        return null;
    }
}
