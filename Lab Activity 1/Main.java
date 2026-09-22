public class Main {
      public static void main(String[] args) {
          Movie movie1 = new Movie();
          movie1.title = "Inception";
          movie1.genre = "Sci-Fi";
          movie1.duration = 148;

          Movie movie2 = new Movie();
         movie2.title = "The Notebook";
        movie2.genre = "Romance";
        movie2.duration = 123;

        Movie movie3 = new Movie();
        movie3.title = "Coco";
         movie3.genre = "Animation";
        movie3.duration = 105;

          movie1.displayInfo();
          movie2.displayInfo();
         movie3.displayInfo();
    }
}