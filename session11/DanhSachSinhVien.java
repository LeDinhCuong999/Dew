package session11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DanhSachSinhVien {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Le Dinh Cuong");
        names.add("Nguyen Minh Hiep");
        names.add("Do Quang Trung");
        names.add("Luong Minh Tien");
        names.add("Bui Huu Thanh");
        names.add("Vu Viet Anh");
        names.add("Nguyen Duc Tam");

        System.out.println("Danh sach sinh vien : " + names);

        names.remove(5);
        System.out.println("Danh sach SV sau khi xoa name(5) : " + names);

        names.set(0, "Tran Van Duong");
        System.out.println("Danh sach SV sau khi sua : " + names);

        System.out.println("\n Danh sach SV sap xep : ");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String nI = namesIterator.next();
            System.out.println(nI);
        }

        System.out.println("\n Danh sach SV sap xep nguoc lai : ");
        ListIterator<String> namesListIterator = names.listIterator(names.size());
        while (namesListIterator.hasPrevious()) {
            String nLI = namesListIterator.previous();
            System.out.println(nLI);
        }

        List<String> newnames = new ArrayList<>();
        newnames.add("Torres");
        newnames.add("Marcelo");
        newnames.add("Okocha");

        names.removeAll(newnames);
        System.out.println("After remove 3 SV : " + names);

        names.removeIf(n -> (n.charAt(0) == 'O'));
        System.out.println("After remove ten SV bat dau bang chu 'O' : " + names);
    }
}
