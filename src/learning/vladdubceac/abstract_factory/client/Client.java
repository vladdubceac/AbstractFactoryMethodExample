package learning.vladdubceac.abstract_factory.client;

import learning.vladdubceac.abstract_factory.factory.FactoryProducer;
import learning.vladdubceac.abstract_factory.factory.MovieFactoryInterface;
import learning.vladdubceac.abstract_factory.factory.MovieGenre;
import learning.vladdubceac.abstract_factory.factory.MovieStudio;
import learning.vladdubceac.abstract_factory.product.BollywoodMovieInterface;
import learning.vladdubceac.abstract_factory.product.HollywoodMovieInterface;

public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface hollywoodMovies = FactoryProducer.getMovieFactory(MovieStudio.HOLLYWOOD);
        HollywoodMovieInterface hollywoodComedyMovie = hollywoodMovies.getHollywoodMovie(MovieGenre.COMEDY);
        HollywoodMovieInterface hollywoodActionMovie = hollywoodMovies.getHollywoodMovie(MovieGenre.ACTION);

        MovieFactoryInterface comedyMovies = FactoryProducer.getMovieFactory(MovieStudio.BOLLYWOOD);
        BollywoodMovieInterface bollywoodComedyMovie = comedyMovies.getBollywoodMovie(MovieGenre.COMEDY);
        BollywoodMovieInterface bollywoodActionMovie = comedyMovies.getBollywoodMovie(MovieGenre.ACTION);

        System.out.println("\nAction movies are : ");
        System.out.println(hollywoodActionMovie.getMovieName());
        System.out.println(bollywoodActionMovie.getMovieName());
        System.out.println("\nComedy movies are : ");
        System.out.println(hollywoodComedyMovie.getMovieName());
        System.out.println(bollywoodComedyMovie.getMovieName());
    }
}
