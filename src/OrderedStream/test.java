package OrderedStream;

public class test {
    public static void main(String[] args) {
        OrderedStream s1 = new OrderedStream(5);
        System.out.println(s1.insert(3,"ccccc"));
        System.out.println(s1.insert(1,"aaaaa"));
        System.out.println(s1.insert(2,"bbbbb"));
        System.out.println(s1.insert(5,"eeeee"));
        System.out.println(s1.insert(4,"ddddd"));
    }
}
