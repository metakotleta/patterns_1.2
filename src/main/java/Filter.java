import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    private int f;
    private Logger log = Logger.getLogger();
    int i = 0;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        list.stream().filter(e -> e <= f).map(e -> "Число " + e + " не проходит").forEach(this::accept);
        log.info("Прошло фильтр " + (list.size() - i) + " из " + list.size());
        return list.stream().filter(e -> e > f).collect(Collectors.toList());
    }

    private void accept(String e) {
        ++i;
        log.info(e);
    }
}
