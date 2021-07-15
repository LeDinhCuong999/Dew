using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace List
{
    class Film
    {
        public string Ten;
        public string QuocGia;
        public string TheLoai;

        public Film() { }
        public Film(string ten, string quocgia, string theloai)
        {
            Ten = ten;
            QuocGia = quocgia;
            TheLoai = theloai;
        }

        public override string ToString()
        {
            return $"Ten film: {Ten} , Quoc gia: {QuocGia} , The loai: {TheLoai} ";
        }
    }
}
