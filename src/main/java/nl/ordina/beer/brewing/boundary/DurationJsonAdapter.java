package nl.ordina.beer.brewing.boundary;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.Duration;

/**
 * Adapter to unmarshal and marshal <code>java.time.Duration</code> objects.
 * JAXB does not not have out of the box support for this yet.
 * 
 * An example of the JSON is : { "duration": 30 }
 * 
 * @author Ordina J-Tech
 */
public class DurationJsonAdapter extends XmlAdapter<String, Duration> {

    @Override
    public Duration unmarshal(String value) {
        // TODO
        return null;
    }

    @Override
    public String marshal(Duration value) {
        // TODO 
        return null;
    }

}
