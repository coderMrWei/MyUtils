/**
 * Created by yibaowei on 16-3-1.
 */
public class MyUtils {
    public static int indexOf(int[] array,int[] target){
        if(target.length == 0){
            return 0;
        }
        outer:
        for(int i = 0;i<array.length-target.length+1;++i){
            for(int j = 0;j<target.length;++j){
                if(array[i+j] != target[j]){
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }
    public static int compare(int one,int two){
        return one-two;
    }
    public static int compareArr(int [] array,int [] target){
        int minLength = Math.min(array.length,target.length);
        for(int i = 0;i<minLength;++i){
            int result = compare(array[i],target[i]);
            if(result != 0){
                return result;
            }
        }
        return array.length-target.length;
    }
}
