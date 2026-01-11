package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlaylist implements Playlist{
    private List<Video> videoList = new ArrayList<>();

    public void addVideo(Video video){
        videoList.add(video);
    }

    public List<Video> getVideoList(){
        return videoList;
    }

    @Override
    public PlaylistIterator createIterator() {
        return new YoutubePlaylistIterator(videoList);
    }
}
