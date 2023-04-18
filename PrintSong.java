class Song {
    String title;
    String artist;
    int year;
    String country;

    Song() {
    }

    Song(int year, String country, String artist, String title) {
        this.year = year;
        this.country = country;
        this.artist = artist;
        this.title = title;
    }

    public void show() {
        System.out.println(year + "년 " + country + "국적의 "
                + artist + "가 부른 " + title);
    }
}
public class PrintSong{
    public static void main(String[] args){
        Song mySong = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
        mySong.show();
    }
}
