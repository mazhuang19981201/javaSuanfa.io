import java.util.Arrays;

/**
 * 二分搜索法（数组内为偶数个）
 * 搜索4的位置
 */
public class ErfenOushu {

    public static void main(String[] args) {

        int[] numble = {3,4,1,2,5,6,7,9,10,8,11,12};
        int start = 0;  // 起始的索引位置
        int end = numble.length;    // 结束的索引位置

        boolean flag = true;

        // 将数组进行排序
        Arrays.sort(numble);

        System.out.println("排序完的数组为：");
        for (int i : numble) {
            System.out.print(i+" ");
        }

        // 对数组进行搜索
        while (flag == true){

            start = end/2;

            // 如果选中的数字小于4
            if (numble[start]<4){
                if (numble[start+1]==4){
                    flag = false;
                    System.out.println("索引为"+(start+1));
                }else if (numble[start+1]<4){
                    start = start+1;
                }
            }else if (numble[start]>4){     // 如果选中的数字大于4
                if (numble[start-1]==4) {
                    flag = false;
                    System.out.println("索引为："+(start-1));
                }else if (numble[start-1]>4){
                    end = start - 1;
                }
            }else if (numble[start]==4){    // 如果选中的数字等于4
                flag = false;
                System.out.println("索引为"+start);
            }else if (numble[start+1] == 4){
                flag = false;
                System.out.println("索引为"+(start+1));
            }

        }
    }
}
