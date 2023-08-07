import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;


public class CollectionInterfaceMethods{
    public static void main(String[] args) throws NullPointerException{
        List<String> list = new ArrayList<String>(10);
        //int size()
        int n = list.size();
        System.out.println("Size of the ArrayList is before add items " + n);

        //boolean add(E element)
        list.add("Mango");
        list.add("Banana");
        list.add("Orange");
        n = list.size();
        System.out.println("Size of the ArrayList is after adding items " + n);

        //boolean remove(Object element)
        list.remove("Mango");
        n = list.size();
        System.out.println("Size of the ArrayList is after removing item " + n);

        // boolean contains(Object element)
        boolean isContain = list.contains("Mango");
        System.out.println("Check for Mango there in list or not ? " + isContain);
        boolean BananaContain = list.contains("Banana");
        System.out.println("Check for Banana there in list or not ? " + BananaContain);

        // boolean isEmpty()
        System.out.println("The list is empty : " + list.isEmpty());

        //boolean containsAll(Collection<?> c)
        List<String> newList = new ArrayList<String>(2);
        // newList.add("Mango");
        // newList.add("Banana");
        newList.add("Pineapple");
        newList.add("Orange");
        System.out.println("Check the elements are in List or not : " + list.containsAll(newList));

        //boolean addAll(Collection<? extends E> c)
        System.out.println("List element before adding newList items " + list);
        boolean allAdd = list.addAll(newList);
        System.out.println("List element after adding newList items " + list + "All element is added ? " + allAdd);
        
        //Iterate all Elements using for each
        System.out.println("----------------------Iterating Using for each------------------");
        for(String item : list){
            System.out.println(item);
        }


        //Iterate using Iterator
        System.out.println("----------------------Iterating Using Iterator------------------");
        for(Iterator<String> it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

        //ListIterator
        System.out.println("----------------------Iterating Using ListIterator------------------");
        ListIterator<String> listIterate = list.listIterator();
        while(listIterate.hasNext()){
            System.out.println(listIterate.next());
        }

        //sort
        System.out.println("The result of sorting as list is ");
        Collections.sort(list);
        for(Iterator<String> it = list.iterator() ; it.hasNext();){
           System.out.println(it.next());
        }

        //Searching a item in a collection
        int atIdx = Collections.binarySearch(list,"Orange");
        System.out.println("Orange is found at index " + atIdx);

        //Copying Data to next list
        // List<String> destList = new ArrayList<String>();
        // Collections.copy(destList, list);
        // System.out.println("Element in Destination list after Copying from list : ");
        // for(Iterator<String> it = destList.iterator();it.hasNext();){
        //     System.out.println(it.next());
        // }

        // boolean removeAll(Collection<?> c)
        boolean allRemove = list.removeAll(newList);
        System.out.println("List item after removing newList items " + list + "All remove done Successfully " + allRemove);
        
        // boolean retainAll(Collection<?> c)
        list.retainAll(newList);
        System.out.println("List element after retainAll method : " + list);

       list.clear();
    }
}