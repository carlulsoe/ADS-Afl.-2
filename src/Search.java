public class Search {
    private int[] lst;

    public Search(int[] infLst)   {
        lst = infLst;
    }

    public int find(int y)  {

        if (lst[0] >= y)    {
            return 0;
        }

        int pointer = 1;
        while (lst[pointer] < y)   {
            pointer = Math.min(pointer*2, lst.length);
        }

        int maxP = pointer;
        int minP = pointer/2;

        while (lst[pointer] != y)  {
            if (maxP - minP == 1) {
                System.out.println("The value you are looking for, is not in the list.");
                return maxP;
            }
            int tempPointer = (int) Math.floor((maxP + minP)/2);
            if (y < lst[tempPointer])   {
                maxP = tempPointer;
            }
            else    {
                minP = tempPointer;
            }
            pointer = (int) Math.floor((minP + maxP)/2);
        }
        return pointer;
    }
}
