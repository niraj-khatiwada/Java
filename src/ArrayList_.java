import java.util.ArrayList;

class ArrayList_ {
    public static void ArrayList_(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0)); // Gets
        arrayList.set(0, 100); // Update
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(1));
        System.out.println(arrayList.contains(1));
    }
}
