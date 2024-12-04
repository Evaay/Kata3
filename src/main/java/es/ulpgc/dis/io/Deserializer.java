package es.ulpgc.dis.io;

import es.ulpgc.dis.Model.Title;

public interface Deserializer {
    Title deserialize(String line);
}
