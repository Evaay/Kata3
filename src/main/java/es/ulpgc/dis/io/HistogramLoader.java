package es.ulpgc.dis.io;

import es.ulpgc.dis.Model.Histogram;

public interface HistogramLoader {
    Histogram load(String archive);
}
