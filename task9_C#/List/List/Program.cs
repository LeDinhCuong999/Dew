using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Collections;

namespace List
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** ListGame va ListFilm yeu thich cua toi *****\n");
            UseFilmCollection();
            Console.WriteLine();
            UseGameCollection();
            Console.WriteLine();
            UseGenericList();

            Console.ReadLine();

        }

        static void UseFilmCollection()
        {
            Console.WriteLine("***** Custom Film Collection *****\n");
            FilmCollection myFilm = new FilmCollection();
            myFilm.AddFim(new Film("Bo Gia", "Viet Name", "Gia dinh"));
            myFilm.AddFim(new Film("Mr.Bean", "English", "Hai huoc"));
            myFilm.AddFim(new Film("Pokemon", "Nhat Ban", "Anime"));


            foreach (Film f in myFilm)
                Console.WriteLine(f);
            Boolean end = false;
            string chon;
            while (!end)
            {
                Console.WriteLine("Ban co muon them fim moi : (Y/N)");
                chon = Console.ReadLine();
                if (chon == "Y")
                {
                    Console.WriteLine("***** Moi ban nhap  *****\n");
                    //  List<Fim> moreFim = new List<Fim>();

                    Console.WriteLine("Ten Film : \n");
                    string ten = Console.ReadLine();
                    Console.WriteLine("QuocGia Film : ");
                    string quocgia = Console.ReadLine();
                    Console.WriteLine("TheLoai film : ");
                    string theloai = Console.ReadLine();
                    myFilm.AddFim(new Film(ten, quocgia, theloai));

                    foreach (Film f in myFilm)
                        Console.WriteLine(f);
                }
                else
                {
                    end = true;
                    break;
                }

            }

        }

        static void UseGameCollection()
        {
            Console.WriteLine("***** Custom Game Collection ******\n");
            GameCollection myGame = new GameCollection();
            myGame.AddGame(new Game("PUBG", "1GB", "Ban sung"));
            myGame.AddGame(new Game("League of Legends", "600MB", "Chien thuat"));
            myGame.AddGame(new Game("Total War", "2GB", "Chien thuat"));



            foreach (Game g in myGame)
                Console.WriteLine(g);

            Boolean end = false;
            String chon;
            while (!end)
            {
                Console.WriteLine("Ban co muon them Game moi : (Y/N)");
                chon = Console.ReadLine();
                if (chon == "Y")
                {
                    Console.WriteLine("***** Moi ban nhap *****\n");
                    List<Game> moreGame = new List<Game>();

                    Console.WriteLine("Name Game : ");
                    string ten = Console.ReadLine();
                    Console.WriteLine("Flow game : ");
                    string dotuoi = Console.ReadLine();
                    Console.WriteLine("Category game : ");
                    string theloai = Console.ReadLine();
                    moreGame.Add(new Game(ten, dotuoi, theloai));
                    Console.WriteLine(moreGame[0]);

                    foreach (Game g in myGame)
                        Console.WriteLine(g);
                    foreach (Game g in moreGame)
                        Console.WriteLine(g);


                    //Console.WriteLine("Ban muon xoa Game ");

                    //Console.WriteLine("Nhap ten game can xoa : ");
                    //string names = Console.ReadLine();

                    //myGame.ClearGame (names);




                }
                else
                {
                    end = true;
                    break;
                }
            }
        }
        static void UseGenericList()
        {
            Console.WriteLine("***** Synthetic *****\n");
            List<int> moreInts = new List<int>();
            moreInts.Add(4);
            moreInts.Add(4);
            int sum = moreInts[0] + moreInts[1];
            Console.WriteLine("Synthetic  : " + sum);

            Console.ReadLine();
        }
    }
}
