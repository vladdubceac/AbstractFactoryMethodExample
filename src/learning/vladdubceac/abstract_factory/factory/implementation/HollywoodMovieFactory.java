package learning.vladdubceac.abstract_factory.factory.implementation;

import learning.vladdubceac.abstract_factory.factory.MovieFactoryInterface;
import learning.vladdubceac.abstract_factory.factory.MovieGenre;
import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.implementation.HollywoodActionMovie;
import learning.vladdubceac.abstract_factory.product.implementation.HollywoodComedyMovie;

public class HollywoodMovieFactory implements MovieFactoryInterface {
    @Override
    public HollywoodMovieInterface getHollywoodMovie(MovieGenre genre) {
        if (genre == null) {
            return null;
        }
        ;
        if (MovieGenre.ACTION == genre) {
            return new HollywoodActionMovie();
        } else if (MovieGenre.COMEDY == genre) {
            return new HollywoodComedyMovie();
        }
        return null;
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie(MovieGenre genre) {
        return null;
    }
}
