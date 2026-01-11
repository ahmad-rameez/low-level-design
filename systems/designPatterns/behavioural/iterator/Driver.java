package designPatterns.behavioural.iterator;

public class Driver {
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("My First Video"));
        playlist.addVideo(new Video("My Second Video"));

        PlaylistIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
