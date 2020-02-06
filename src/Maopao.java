/**
 * 用java语言实现冒泡排序（将数字按从小到大的顺序排序）
 */
public class Maopao {
    public static void main(String[] args) {

        int[] numble = {2,1,3,5,4,7,6,9,8};
        int count = 0;  // 循环次数

        for (int i=0;i<numble.length-1;i++){

            for (int j=0;j<numble.length-1-i;j++)
            // 两两判断 如果前一个数比后一个数大就交换位置
            if (numble[j]>numble[j+1]){
                int temp = numble[j];
                numble[j] = numble[j+1];
                numble[j+1] = temp;
            }
        }

        // 输出结果
        System.out.println("排序完的数组为：");
        for (int a : numble){
            System.out.print(a);
        }
    }
}
