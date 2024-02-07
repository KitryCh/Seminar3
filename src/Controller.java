import java.util.List;
class Controller {
    private StreamService streamService;

    public Controller() {
        streamService = new StreamService();
    }

    public List<Stream> sortStreams(List<Stream> streams) {
        return streamService.sortStreams(streams);
    }
}