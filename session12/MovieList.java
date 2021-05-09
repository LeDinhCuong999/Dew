package session12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        int i=0;

        List<String> movies = new ArrayList<>();
        movies.add("Pokemon");
        movies.add("One Piece");
        movies.add("Conan");
        movies.add("Doraemon");
        movies.add("Naruto");
        movies.add("Dragon Ball");
        movies.add("Fairy Tail");

        Scanner scan = new Scanner( System.in );

        do{
            System.out.println("Yeu cau cua ban la gi? ");
            System.out.println("===========================================================");
            System.out.println("1. Them phim moi.");
            System.out.println("2. In ra danh sach cac bo phim yeu thich.");
            System.out.println("3. Chinh sua ten phim da co.");
            System.out.println("4. Xoa di mot bo phim trong danh sach yeu thich.");
            System.out.println("5. Tim kiem ten phim trong danh sach yeu thich.");
            System.out.println("===========================================================");
            System.out.println("lua chon cua ban la: ");

            i=Integer.parseInt( scan.nextLine() );
            switch (i){
                case 1:
                    System.out.println("Xin moi nhap ten phim");
                    String f = scan.nextLine();
                    movies.add( f );
                    System.out.println("Phim"+f+"them vao vi tri:"+(movies.indexOf( f )+1));
                    System.out.println(movies);
                    break;
                case 2:
                    System.out.println("Chon vi tri muon sua");
                    int v = Integer.parseInt( scan.nextLine() );
//                    int v = scan.nextInt();
                    System.out.println("Nhap ten phim moi");
                    String m =scan.nextLine();
                    movies.set( v,m );
                    System.out.println("Sua doi thanh cong");
                    System.out.println(+v+"."+movies.get( v ));
                    break;
                case 3:
                    System.out.println("Nhap vi tri muon xoa");
                    int x = Integer.parseInt( scan.nextLine() );
                    movies.remove( x );
                    System.out.println("Xoa thanh cong");
                case 4:
                    for (int y=0; y<movies.size();y++){
                        System.out.println(y+"."+movies.get( y ));
                    }
                case 5:
                    System.out.println("ten phim muon nhap");
                    String t = scan.nextLine();
                    System.out.println("Phim"+t+"co vi tri :"+movies.indexOf( t ));
                }
            }while (i<=5);

    }
}
