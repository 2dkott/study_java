import java.util.HashMap;
import java.util.List;

public class StorageSearch {

    public List<NoteBook> searchNoteBookBy(HashMap<FilterObjects, Object> filter, List<NoteBook> noteBookList) {
        return noteBookList.stream().filter(x-> isEqual(filter.get(FilterObjects.OS), x.getOsName()))
                .filter(x-> isEqual(filter.getOrDefault(FilterObjects.COLOR, ""), x.getColor()))
                .filter(x-> isEqual(filter.getOrDefault(FilterObjects.PROC, ""), x.getProcessor()))
                .filter(x-> isEqual(filter.getOrDefault(FilterObjects.RAM, ""), x.getRam()))
                .filter(x-> isEqual(filter.getOrDefault(FilterObjects.SSD, ""), x.getSsdStorage()))
                .toList();
    }

    private boolean isEqual(Object value1, Object value2) {
        if(value1 instanceof String && ((String) value1).isBlank()) return true;
        if(value1 instanceof Integer && ((Integer)value1) == 0) return true;
        return value1.equals(value2);
    }

}
