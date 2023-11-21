package info.uvt.ro.testsp;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class MessageReader {

    public List<Message> readMessages(String filePath) throws Exception {
        return new ObjectMapper().readValue(new File(filePath), new TypeReference<List<Message>>() {});
    }
}
