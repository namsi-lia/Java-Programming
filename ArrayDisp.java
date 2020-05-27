public class ArrayDisp {
    static <T> void Display(T[] arr){
        for (int i=0; i< arr.length; ++i){
            if (arr[i] !=null){
                System.out.println(arr[i] +"");
            }
        }
    }
    public static void main(String[]args){
        String[] names=new String[10];
        names[0]="david";
        names[1]="Ncuti";
        names[2]="Nella";
        names[3]="lizzo";
        names[4]="tobias";
        names[5]="collins";
        names[6]="kedar";
        names[7]="lorna";
        Display(names);
        Integer[] numbers=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        Display(numbers);
    }

}
