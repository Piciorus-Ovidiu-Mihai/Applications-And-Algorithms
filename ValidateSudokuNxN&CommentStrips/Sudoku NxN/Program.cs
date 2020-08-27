using System;
using System.Collections.Generic;
using System.Linq;
using System.Security;
using System.Threading;

namespace TehnicalAssesment2
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] array2D = new int[,] { // there you can declare what sudoke solve want to check with size NxN and sqrt(N)=integer
                { 1, 2, 3, 4 }, 
                { 4, 1, 2, 1 }, 
                { 3, 4, 1, 2 },
                { 2, 1, 4, 3 } 
            };
            int N = (int)Math.Sqrt(array2D.Length);
            if (checkColumns(array2D) && checkRows(array2D) && checkLower(array2D)) //if the all numbers from rows and columns are distinct
            {
                IterateArray(array2D);                  //check if the each 'mini-sudoku' squares has different values and if not the program stop and show Sudoku is not valid
                Console.WriteLine("Sudoku is valid!");  // if the program didnt stop that means the sudoku is valid
            }
            else
            {
                Console.WriteLine("Sudoku is not valid ! "); // if numbers from rows and columns are not distinct that means sudoku is not valid
            }
    
        }
        static void IterateArray(int[,] array)                                      //this method split the multi dimensional array with size N x N into many multi dimensional arrays with size sqrt(N)*sqrt(N)
        {
            double tDim = Math.Sqrt(Math.Sqrt(array.Length));
            int dim = (int)tDim;
            if (dim != tDim) throw new ArgumentException("Not a valid array!");

            for (int i = 0; i < dim; i++)
            {
                IterateRows(array, dim, i);
            }
        }

        static void IterateRows(int[,] array, int dim, int pass)
        {
            int maxRow = dim * dim;
            IList<int> list = new List<int>(maxRow);
            for (int curRow = 0; curRow < maxRow; curRow++)
            {
                IterateColumns(array, dim, curRow, pass, list);
                if (list.Count == maxRow)
                {
                    PrintNewArray(list, dim);
                    list.Clear();
                }
            }
        }

        static void IterateColumns(int[,] array, int dim, int row, int pass, IList<int> list)
        {
            int maxCol = dim + (dim * pass);
            for (int curCol = pass * dim; curCol < maxCol; curCol++)
            {
                list.Add(array[row, curCol]);
            }
        }

        static void PrintNewArray(IList<int> list, int dim)
        {
            bool ok = true;
            for (int i = 0; i < list.Count; i++)
            {
                if (list.Distinct().Count() != list.Count())
                {

                    Console.WriteLine("Sudoku is not valid");
                    break;
                    
                }
            }
        }
        static Boolean checkRows(int[,] array2D) //check if all rows have different values
        {
            int N = (int)Math.Sqrt(array2D.Length);
            for (int row = 0; row < N; row++)
            {
                int[] arrayRow = new int[N];
                for (int col = 0; col < N; col++)
                {
                    arrayRow[col] = array2D[row, col];             
                }
                if (!(arrayRow.Distinct().Count() == N))
                {
                    return false;
                }
            }
            return true;
        }
        static Boolean checkColumns(int[,] array2D) //check if all columns have different values
        {
            int N = (int)Math.Sqrt(array2D.Length);
            for (int col = 0; col < N; col++)
            {
                int[] arrayCol = new int[N];
                for (int row = 0; row < N; row++)
                {
                    arrayCol[row] = array2D[row, col];
                }
                if (!(arrayCol.Distinct().Count() == N))
                {
                    return false;
                }
            }
            return true;
        }

        static Boolean checkLower(int[,] array2D) //check if all numbers from the sudoku are lower than N
        {
            int N = (int)Math.Sqrt(array2D.Length);
            for (int row = 0; row < N; row++)
            {
                int[] arrayRow = new int[array2D.Length];
                for (int col = 0; col < N; col++)
                {
                    if (array2D[row, col] > N)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
