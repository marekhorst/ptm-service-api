package eu.dnetlib.ptm.service;

import java.util.Map;

/**
 * Request command encapsulating set of input parameters.
 * 
 * @author mhorst
 *
 */
public class Command {

    private Map<String, String> map;

    public Command() {
        // required by deserialization mechanism
        super();
    }

    public Command(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Command [myMap=" + map + "]";
    }
}
