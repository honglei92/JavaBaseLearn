/**
 * 輸入車牌號.分号分隔，打印出不限行的车牌号
 */
class Test1 {
    static String numberFormat = "0123456789";

    public static void main(String[] args) {
        System.out.println(getNumber("1235p;p0909;p0902", 4));
    }

    static String getNumber(String input, int day) {
        if (input.length() >= 0 && input.length() <= 10) {
            //0到10的长度判断
            if (input.length() == 5) {
                return getNumberIntenal(input, day);
            } else {
                return "error";
            }
        } else {
            String[] array = input.split(";");
            String result = "";
            for (int i = 0; i < array.length; i++) {
                result += getNumberIntenal(array[i], day) + " ";
            }
            return result;
        }
    }

    static String getNumberIntenal(String request, int day) {
        if (day > 5) {
            // 周末不限行
            return request;
        } else {
            for (int i = 0; i < 9; i++) {
                if (request.contains(i + "")) {
                    // 是车牌号
                    for (int j = 4; j >= 0; j--) {
                        if (numberFormat.contains(request.charAt(j) + "")) {
                            if (Integer.parseInt(request.charAt(j) + "") - day == 0
                                    || Integer.parseInt(request.charAt(j) + "") - day == 5) {
                                return "限行";
                            } else {
                                return request;
                            }
                        }
                    }
                    return "error";
                }
            }
        }
        return "error";
    }
}