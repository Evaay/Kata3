package es.ulpgc.dis.Control;

import es.ulpgc.dis.Model.Histogram;
import es.ulpgc.dis.Model.Title;
import es.ulpgc.dis.io.TSVTitleReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitleTypeHistogramLoader implements HistogramLoader{
    public Map<Title.TitleType, Integer> generateMapHistogram(List<Title> titles) {
        Map<Title.TitleType, Integer> histogram = new HashMap<>();
        for (Title title : titles) {
            histogram.put(title.titleType(), histogram.getOrDefault(title.titleType(), 0) + 1);
        }
        return histogram;
    }

    public Map<Title.TitleType, Integer> createMapHistogram(String archive) {
        File file = new File(archive);
        List<Title> titles = new TSVTitleReader(file).read();
        Map<Title.TitleType, Integer> histogram = new TitleTypeHistogramLoader().generateMapHistogram(titles);
        return histogram;
    }

    @Override
    public Histogram load(String archive) {
        return null;
    }
}
