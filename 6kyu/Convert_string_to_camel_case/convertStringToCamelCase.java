class Solution{
  static String toCamelCase(String s){
        char[] array = s.toCharArray();

        String input = "";
        for (int i = 0; i < array.length; i++)  {
            if (array[i] == '-' || array[i] == '_') {
                if (array[i + 1] >= 97 && array[i + 1] <= 122) {
                    array[i + 1] -= 32;
                }
            }
            input += array[i];
        }

        String[] finalArr = input.contains("-") ? input.split("-") : input.split("_");

        input = "";
        for (int i = 0; i < finalArr.length; i++)   {
            input += finalArr[i];
        }

        return input;
    }
}
