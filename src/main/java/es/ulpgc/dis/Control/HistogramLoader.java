package es.ulpgc.dis.Control;

import es.ulpgc.dis.Model.Histogram;

public interface HistogramLoader {
    Histogram load(String archive);
}
