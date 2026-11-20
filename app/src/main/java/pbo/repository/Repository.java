package pbo;

import java.util.ArrayList;
import java.util.List;
import util.Identifiable;

public class Repository<T extends Identifiable<ID>, ID> {
    private List<T> dataList;

    public Repository() {
        this.dataList = new ArrayList<>();
    }

    public void save(T item) {
        dataList.add(item);
    }

    public List<T> findAll() {
        return dataList;
    }

    public T findById(ID id) {
        for (T item : dataList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean delete(ID id) {
        T target = findById(id);
        if (target != null) {
            dataList.remove(target);
            return true;
        }
        return false;
    }
}