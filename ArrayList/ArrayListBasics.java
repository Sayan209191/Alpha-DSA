import java.util.ArrayList;
public class ArrayListBasics{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // Add element 

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Add element in a specific index

        list.add(2,15);
        System.out.println(list);

        // remove element

        list.remove(2);
        System.out.println(list);

        // Set element at index

        list.set(2,15);
        System.out.println(list);

        // Contains Element

        System.out.println(list.contains(11));

        // Size of ArrayList
        System.out.println(list.size());

        // Iterate over all elements through loops

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}