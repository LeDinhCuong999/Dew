using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Collections;

namespace List
{
    class GameCollection : IEnumerable
    {
        private ArrayList arGame = new ArrayList();

        public Game GetGame(int pos) => (Game)arGame[pos];

        public void AddGame(Game g)
        {
            arGame.Add(g);
        }

        public void ClearGame()
        {
            arGame.Clear();
        }

        public int Count => arGame.Count;

        IEnumerator IEnumerable.GetEnumerator() => arGame.GetEnumerator();


    }
}
