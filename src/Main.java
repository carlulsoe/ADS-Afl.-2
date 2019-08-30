public class Main {

    public static void main(String[] args) {
        int[] list = {3, 5, 7, 9, 11, 17, 19, 23, 31, 33, 37};

        Search s1 = new Search(list);


        for (int i = 1; i < list.length; i++)   {
            if (s1.find(list[i]) == i) {
                System.out.println(true);
            }
            else    {
                System.out.println(i + " false");
            }

        }
    }


}

