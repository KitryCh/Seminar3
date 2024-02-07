import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Создаем объекты потоков и групп
        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("Group 1"));
        stream1.addGroup(new StudyGroup("Group 2"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("Group 3"));
        stream2.addGroup(new StudyGroup("Group 4"));
        stream2.addGroup(new StudyGroup("Group 5"));

        // Создаем контроллер
        Controller controller = new Controller();

        // Создаем список потоков и добавляем в него созданные потоки
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Сортируем список потоков
        List<Stream> sortedStreams = controller.sortStreams(streams);

        // Выводим отсортированные потоки
        for (Stream stream : sortedStreams) {
            System.out.println("Stream:");
            for (StudyGroup group : stream) {
                System.out.println(" - " + group.getName());
            }
        }
    }
}