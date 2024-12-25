package OrderedStream;


import java.util.ArrayList;
import java.util.List;

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
public class OrderedStream {

    String[] stream;
    int ptr;

    public OrderedStream(int n) {
        this.stream = new String[n];
        this.ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        this.stream[idKey - 1] = value;
        ArrayList<String> list = new ArrayList<>();
        if (this.ptr == idKey - 1){
            while (this.ptr < this.stream.length && this.stream[this.ptr] != null){
                list.add(this.stream[this.ptr]);
                this.ptr++;
            }
        }
        return list;
    }
}
