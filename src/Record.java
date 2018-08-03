public class Record {
    public String title;
    public String artist;
    public int releaseYear;
    public int tracks;

    public Record(String title, String artist, int releaseYear, int tracks) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public String getInfo() {
        return "Title: " +  title + "Artist: " +  artist + "Release: " +  releaseYear + "Tracks: " +  tracks;
    }

    public boolean from2000() {
        if (releaseYear >= 2000) {
            return true;
        }
        return false;
    }
    public static Record [] recordCollection = new Record [5];

    public static void main(String[] args) {
        Record record = new Record("Blue Print ", "Jay-Z ", 2006 , 11 );
        Record record1 = new Record(" kool ", " Kendrick LaMar ",  2015 , 15 );
        Record record2 = new Record("Scorpion ", "Drake ", 2018 , 12 );
        Record record3 = new Record("Mya ", "Mya ", 1990, 14 );
        Record record4 = new Record("Maze ", "Frankie Bev ", 1975 , 15 );


//        System.out.println(record1.getInfo());
//        System.out.println(record2.from2000());

        recordCollection[0] = record1;
        recordCollection[1] = record2;
        recordCollection[2] = record3;
        recordCollection[3] = record4;

        for(Record album : recordCollection){
            System.out.println(record2.getInfo());
        }



    }
}
