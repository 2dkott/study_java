import java.util.*;

public class ShopStorage {

    private List<NoteBook> noteBookList = new ArrayList<>();
    StorageSearch search = new StorageSearch();

    public ShopStorage(){

    }

    public List<NoteBook> searchNoteBookByFilter(HashMap<FilterObjects, Object> filter) {
        return search.searchNoteBookBy(filter, noteBookList);
    }

    public void addNoteBook(NoteBook noteBook){
        noteBookList.add(noteBook);
    }

    public List<NoteBook> getNoteBookList() {
        return noteBookList;
    }
}
