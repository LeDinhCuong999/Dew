using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Collections;

namespace List
{
    class FilmCollection : IEnumerable
    {
        private ArrayList arFilm = new ArrayList();

        public Film GetFim(int pos) => (Film)arFilm[pos];

        public void AddFim(Film f)
        {
            arFilm.Add(f);
        }

        public void ClearFim()
        {
            arFilm.Clear();
        }

        public int Count => arFilm.Count;

        IEnumerator IEnumerable.GetEnumerator() => arFilm.GetEnumerator();

    }
}
