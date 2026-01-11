package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlaylistIterator implements PlaylistIterator{
    private List<Video> videos = new ArrayList<>();
    private int idx;

    public YoutubePlaylistIterator(List<Video> videos) {
        this.videos = videos;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < videos.size();
    }

    @Override
    public Video next() {
        return hasNext() ? videos.get(idx++) : null;
    }
}
