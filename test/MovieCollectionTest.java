import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void getMovieArr() {
        //Arrange
        MovieCollection collection2 = new MovieCollection();

        //Act
        int actualSize = collection2.getMovieArr().size();
        int expectedResult = 0;

        //Assert
        Assertions.assertEquals(expectedResult, actualSize);
    }

    @Test
    void addMovie() {
        //Arrange
        MovieCollection addMovieObj = new MovieCollection();

        //Act
        addMovieObj.addMovie("film1", "director1", 2002, true, 220, "genre1");
        int actualResult = addMovieObj.getMovieArr().size();

        //Assert
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void addMovie2() {
        //Arrange
        MovieCollection addMovieObj = new MovieCollection();

        //Act
        addMovieObj.addMovie("film1", "director1", 2002, true, 220, "genre1");
        addMovieObj.addMovie("film2", "director2", 2002, true, 220, "genre2");
        int actualResult = addMovieObj.getMovieArr().size();

        //Assert
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

}