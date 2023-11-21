package info.uvt.ro.testsp;
public class MessageDecoder {

    private MessageDecoderStrategy atreidesDecoder = new AtreidesMessageDecoder();
    private MessageDecoderStrategy harkonnenDecoder = new HarkonnenMessageDecoder();

    public String decodeMessage(Message message) {
        if ("atreides".equals(message.getHouse())) {
            return atreidesDecoder.decode(message.getMessage());
        } else if ("harkonnen".equals(message.getHouse())) {
            return harkonnenDecoder.decode(message.getMessage());
        }

        return "Casa necunoscuta";
    }
}
