public class Movie {
    String name;
    int premiereDate;
    boolean includedInPlan;
    double reviews;
    int totalReviews;
    int duration;

    void showDatasheet(){
        System.out.println("Movie Name: " + name);
        System.out.println("Premiere Date: " + premiereDate);
        System.out.println("Duration: " + duration);
    }

    void reviews(double rating){
        somareviews += rating;
        allReviews ++;

    }

}
