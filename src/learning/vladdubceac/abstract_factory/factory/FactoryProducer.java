package learning.vladdubceac.abstract_factory.factory;

import learning.vladdubceac.abstract_factory.factory.implementation.BollywoodMovieFactory;
import learning.vladdubceac.abstract_factory.factory.implementation.HollywoodMovieFactory;

public class FactoryProducer {
    public static MovieFactoryInterface getMovieFactory(MovieStudio movieStudio) {
        if (MovieStudio.HOLLYWOOD == movieStudio) {
            return new HollywoodMovieFactory();
        } else if (MovieStudio.BOLLYWOOD == movieStudio) {
            return new BollywoodMovieFactory();
        }
        return null;
    }
}
