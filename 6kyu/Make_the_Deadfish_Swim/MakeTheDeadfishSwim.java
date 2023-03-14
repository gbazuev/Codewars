public class DeadFish {
    public static int[] parse(String data) {
        int[] resArr = new int[getArrLength(data)];
        int forLoop = 0;
        int counter = 0;
        for (int i = 0; i < data.length(); ++i) {
            switch (data.charAt(i)) {
            case 'i':
                forLoop++;
                continue;

            case 'd':
                forLoop--;
                continue;

            case 's':
                forLoop *= forLoop;
                continue;

            case 'o':
                resArr[counter] = forLoop;
                counter++;
                continue;
            }
        }
        return resArr;
    }
  
      static int getArrLength(String data)    {
        int res = 0;
        for (int i = 0; i < data.length(); ++i) {
            res += data.charAt(i) == 'o' ? 1 : 0;
        }
        return res;
    }
}
