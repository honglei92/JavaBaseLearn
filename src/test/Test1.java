/**
 * 輸入車牌號.分号分隔，打印出不限行的车牌号
 */
class Test1 {
    static String numberFormat = "0123456789";

    public static void main(String[] args) {
        // System.out.println(getNumber("1235", 4));
        // System.out.println(getNumber("1235p0", 4));
        // System.out.println(getNumber("1235p", 4));
        // System.out.println(getNumber("1235p;p0904;p0902", 4));
        System.out.println(getNumber("123p;p0909;p09020", 4));
    }

    static String getNumber(String input, int day) {
        if (input.length() == 5) {// 刚好一个车牌号长度 不需要分号
            return getNumberIntenal(input, day);
        } else {// 需要利用分号分隔
            String[] array = input.split(";");
            String result = "";
            for (int i = 0; i < array.length; i++) {
                result += getNumberIntenal(array[i], day) + "  ";
                // System.out.println("————————————————" + result);

            }
            return result;
        }
    }

    static String getNumberIntenal(String request, int day) {
        if (request.length() == 5) {// 首先判断长度正确
            for (int i = 0; i < 9; i++) {
                if (request.contains(i + "")) {// 包含数字 是车牌号
                    for (int j = 4; j >= 0; j--) {// 从后往前取车牌号的某一位
                        String charAtJ = request.charAt(j) + "";// 倒数第j位
                        if (numberFormat.contains(charAtJ)) {// 是数字
                            if (day > 5) { // 周末不限行
                                return request;
                            } else {// 工作日限行
                                int dayGap = Integer.parseInt(charAtJ) - day;// 差距值
                                if (dayGap == 0 || dayGap == 5) {// 判断限行
                                    return "限行";
                                } else {
                                    return request;
                                }
                            }
                        }
                    }
                }
            }
        }
        return "error";
    }
}