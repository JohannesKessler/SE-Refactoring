/**
 * Created by Johannes Keßler on 02.05.2016.
 */
class NewReleasePrice extends Price{
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double getCharge(int daysRented){
        return daysRented * 3;
    }
}
