import java.util.Arrays;

/**
 * 用java实现简单算法二分搜索法(奇数形式)简单实现
 */
public class ErFen {

    /**
     * 搜索2所在的下标
     * @param args
     */
    public static void main(String[] args) {

        int[] numble = {1,3,4,5,8,6,2,7,10,9,0};
        int start = 0;           // 数组的开始下标
        int end = numble.length; // 数组的结束下标

       
        boolean condition = true; // 继续循环的条件

        // 将数组排序
        Arrays.sort(numble);

        if (condition){
            // 如果大于所要查询的数字
            if (numble[end/2]>2){
            end = end/2;
            }
            // 如果小于所要查询的数字
            if (numble[end/2]<2){
                start = end/2;
            }
            // 如果等于所要查询的数字
            if(numble[end/2]==2){
                System.out.println("查到了！您要查询的数字下标为："+end/2);
                // 结束循环
                condition = false;
            }
        }
    }
}
