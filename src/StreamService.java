import java.util.List;
class StreamService {
    public List<Stream> sortStreams(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        streams.sort(comparator);
        return streams;
    }
}