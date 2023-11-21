package info.uvt.ro.testsp;
import java.util.List;


public class TestSpApplication {

    public static void main(String[] args) {
        try {
            MessageReader messageReader = new MessageReader();

            // Replace "path/to/messages.json" with the actual file path
            List<Message> messages = messageReader.readMessages("C:\\Users\\Alex\\Desktop\\Test SP\\TestSP\\src\\main\\java\\resources\\messages.json");

            MessageDecoder messageDecoder = new MessageDecoder();
            for (Message message : messages) {
                String decodedMessage = messageDecoder.decodeMessage(message);
                System.out.println(message.getDate() + " | " + decodedMessage + " | " + message.getHouse());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}