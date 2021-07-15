using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace List
{
    class Game
    {
        public string Ten;
        public string DoTuoi;
        public string TheLoai;

        public Game() { }
        public Game(string ten, string dotuoi, string theloai)
        {
            Ten = ten;
            DoTuoi = dotuoi;
            TheLoai = theloai;
        }

        public override string ToString()
        {
            return $"Ten game: {Ten} , Do tuoi: {DoTuoi} , The loai: {TheLoai} ";
        }
    }
}
