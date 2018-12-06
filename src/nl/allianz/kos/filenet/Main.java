package nl.allianz.kos.filenet;

import com.allianz.kos.filenet.FileNetApi;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        FileNetApi fileNetApi = new FileNetApi();
        LOGGER.info("Using FileNet API");
        System.out.println("Result of FileNet Store method is: " + fileNetApi.storeFile());
    }
}
